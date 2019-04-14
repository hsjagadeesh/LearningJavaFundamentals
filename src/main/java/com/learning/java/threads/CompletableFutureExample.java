package com.learning.java.threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println(CompletableFuture.supplyAsync(() -> {
            System.out.println("Testing");
            return "Done!";
        }).get());

//        CompletableFuture.runAsync();
    }
}
