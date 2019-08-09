package com.github.tomj0101.grpc;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MarketClient {
    private static final Logger logger = Logger.getLogger(MarketClient.class.getName());

    private final ManagedChannel channel;
    private MarketSummaryGrpc.MarketSummaryBlockingStub blockingStub;

    public MarketClient(String hostname, int port) {
        channel = ManagedChannelBuilder.forAddress(hostname, port)
                .usePlaintext(true)
                .build();
        blockingStub = MarketSummaryGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void marketSummary(String name) {
        logger.info("Trying to greet " + name);
        try {
            Map<String, String> business = new HashMap<>();
            business.put("NET", "Netflix");
            business.put("E", "Eat");

            PhoneNumber.Builder phoneNumber = PhoneNumber.newBuilder();
            MarketSummaryRequest.Builder request = MarketSummaryRequest.newBuilder();
            for (int i = 0; i < 5 ; i++) {
                phoneNumber.setName("tom").setNumber("876-234-221"+i).build();
                request.addPhones(phoneNumber);
            }

            request.setSymbol("Google");
            MarketSummaryResponse response = blockingStub.getResultTodayMarket(request.build());

            logger.info("Response from server: " + response);
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "Request to grpc server failed", e);
        }
    }


    public static void main(String[] args) throws Exception {
        MarketClient client = new MarketClient("localhost", 42420);
        String name = args.length > 0 ? args[0] : "unknown";

        try {
            client.marketSummary(name);
        } finally {
            client.shutdown();
        }
    }
}
