package ru.otus.numbers.service;

import com.example.grpc.Empty;
import com.example.grpc.SNSRequest;
import com.example.grpc.SNSResponse;
import com.example.grpc.SendingNumbersServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class SendingNumbersServiceImpl extends SendingNumbersServiceGrpc.SendingNumbersServiceImplBase {
    NumberGeneration numberGeneration = new NumberGenerationImpl();


    @Override
    public void sendingNumber(SNSRequest request, StreamObserver<Empty> response) {

        System.out.println("Получил  от клиента " + request + " " + numberGeneration.hashCode());
        numberGeneration.setFirstValue(request.getFirstValue());
        numberGeneration.setLastValue(request.getLastValue());
        response.onNext(null);
        response.onCompleted();
    }


    @Override
    public void receiveNumber(Empty request, StreamObserver<SNSResponse> responseObserver) {

        if (numberGeneration.getFirstValue() < numberGeneration.getLastValue()) {
            numberGeneration.generation();

        } else {
            numberGeneration.setFirstValue(999);
        }

        SNSResponse response = SNSResponse.newBuilder()
                .setResponseNumber(numberGeneration.getFirstValue())
                .build();

        responseObserver.onNext(response);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" new value: " + numberGeneration.getFirstValue());

        responseObserver.onCompleted();
    }

}
