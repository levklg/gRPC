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

import java.util.concurrent.CountDownLatch;

public class GRPCClient {

    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 8190;

    public static void main(String[] args) throws InterruptedException {

        NumberGeneration numberGeneration = new NumberGenerationImpl();

        final ManagedChannel channel = ManagedChannelBuilder.forAddress(SERVER_HOST, SERVER_PORT)
                .usePlaintext()
                .build();

        var stub = SendingNumbersServiceGrpc.newStub(channel);

        Empty empty = null;
        SNSRequest request = SNSRequest.newBuilder()
                .setNumber(numberGeneration.generation(0, 50))
                .build();
       // var stub1 = SendingNumbersServiceGrpc.(channel);







        var latch = new CountDownLatch(1);
        while (true) {
            stub.receiveNumber(  empty, new StreamObserver<SNSResponse>() {
                public void onNext(SNSResponse response) {


                    System.out.println("Client получил " + response);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                public void onError(Throwable t) {
                    System.err.println(t);
                }

                public void onCompleted() {

                    System.out.println("\n\nЯ все!");
                    latch.countDown();
                }
            });
            latch.await();
            channel.shutdown();
        }

    }
}
