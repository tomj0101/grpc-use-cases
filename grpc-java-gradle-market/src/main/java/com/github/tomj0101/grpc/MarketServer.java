package com.github.tomj0101.grpc;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.logging.Logger;

public class MarketServer {

    private static final Logger logger = Logger.getLogger(MarketServer.class.getName());

    private int port = 42420;
    private Server server;

    private void start() throws Exception {
        logger.info("Starting the grpc server");

        server = ServerBuilder.forPort(port)
                .addService(new MarketSummaryImpl())
                .build()
                .start();

        logger.info("Server started. Listening on port " + port);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** JVM is shutting down. Turning off grpc server as well ***");
            MarketServer.this.stop();
            System.err.println("*** shutdown complete ***");
        }));
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }


    public static void main(String[] args) throws Exception {
        logger.info("Server startup. Args = " + Arrays.toString(args));
        final MarketServer marketServer = new MarketServer();

        marketServer.start();
        marketServer.blockUntilShutdown();
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    private class MarketSummaryImpl extends MarketSummaryGrpc.MarketSummaryImplBase {

        @Override
        public void getResultTodayMarket(MarketSummaryRequest request, StreamObserver<MarketSummaryResponse> responseObserver) {

            MarketSummaryResponse response = MarketSummaryResponse
                    .newBuilder()
                    .addAllPhones(request.getPhonesList())
                    .setSymbol(request.getSymbol())
                    .setStatus(Status.OPEN)
                    .setRate(12000)
                    .setMessage("200 your stock was process "+Status.OPEN).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
