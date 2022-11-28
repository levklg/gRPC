package ru.otus.numbers.service;

import com.example.grpc.Empty;
import com.example.grpc.SNSRequest;
import com.example.grpc.SNSResponse;
import com.example.grpc.SendingNumbersServiceGrpc;
import io.grpc.stub.StreamObserver;

public class SendingNumbersServiceImpl extends SendingNumbersServiceGrpc.SendingNumbersServiceImplBase {
    NumberGeneration numberGeneration = new NumberGenerationImpl();

    @Override
    public void sendingNumber(SNSRequest request, StreamObserver<Empty> response){

        System.out.println("Получил " + request);
    }



    @Override
    public void receiveNumber(Empty request, StreamObserver<SNSResponse> responseObserver){

        while (true) {

            int send = numberGeneration.generation(0, 30);
            SNSResponse response = SNSResponse.newBuilder()
                    .setNumber(send)
                    .build();


            responseObserver.onNext(response);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Отправил " + send);
        }
    }

}
