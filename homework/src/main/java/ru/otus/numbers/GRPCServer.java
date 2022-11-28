package ru.otus.numbers;



import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import ru.otus.numbers.service.SendingNumbersServiceImpl;

import java.io.IOException;

public class GRPCServer {

    public static final int SERVER_PORT = 8190;

    public static void main(String[] args) throws IOException, InterruptedException {


        Server server = ServerBuilder.forPort(SERVER_PORT)
                .addService(new SendingNumbersServiceImpl())
                .build();


        server.start();

        // Server threads are running in the background.
        System.out.println("Server started");
        // Don't exit the main thread. Wait until server is terminated.
        server.awaitTermination();
    }

}
