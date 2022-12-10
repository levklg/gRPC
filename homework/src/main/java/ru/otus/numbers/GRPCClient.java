package ru.otus.numbers;


import com.example.grpc.Empty;
import com.example.grpc.SNSRequest;
import com.example.grpc.SNSResponse;
import com.example.grpc.SendingNumbersServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import ru.otus.numbers.service.NumberGeneration;
import ru.otus.numbers.service.NumberGenerationImpl;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.*;

public class GRPCClient {

    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 8190;

    private static ExecutorService service = Executors.newFixedThreadPool(2);
    private static ConcurrentLinkedDeque deque = new ConcurrentLinkedDeque<Integer>();
    private static boolean recive = false;

    public static void main(String[] args) throws InterruptedException {

        final ManagedChannel channel = ManagedChannelBuilder.forAddress(SERVER_HOST, SERVER_PORT)
                .usePlaintext()
                .build();

        var stubBlock = SendingNumbersServiceGrpc.newBlockingStub(channel);

        SNSRequest request = SNSRequest.newBuilder()
                .setFirstValue(0)
                .setLastValue(30)
                .build();

        stubBlock.sendingNumber(request);
        service.submit(() -> reciveNumberFromServer(channel));
        service.submit(() -> showCurrentValue());

    }

    public static void reciveNumberFromServer(ManagedChannel channel) {
        var stubBlock = SendingNumbersServiceGrpc.newBlockingStub(channel);
        SNSResponse response = null;

        while (true) {
            response = stubBlock.receiveNumber(null);
            if (response.getResponseNumber() == 999) {
                System.out.println("request completed");
                break;
            }
            deque.add(response.getResponseNumber());
            recive = true;
            System.out.println("число от сервера: " + response.getResponseNumber());

        }
    }

    public static void showCurrentValue() {
        int i = 0;
        int currentValue = 0;
        while (i < 50) {

            if (recive) {
                currentValue = currentValue + Integer.parseInt(deque.getLast().toString()) + 1;
                recive = false;
            } else {
                currentValue++;
            }
            System.out.println("currentValue: " + currentValue);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
