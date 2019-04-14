package com.learning.java.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<?> submit = executorService.submit(new RunnableBuildingCache());
        System.out.println(submit.get());
        Future<String> submit1 = executorService.submit(new CallableBuildingCache());
        System.out.println(submit1.get());
        executorService.execute(new RunnableBuildingCache());
        executorService.shutdown();

    }
}
