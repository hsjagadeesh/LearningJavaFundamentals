package com.learning.java.threads;

public class SimpleThreadExecutingInMainThread {

    public static void main(String[] args) {

        new RunnableBuildingCache().run();
        new RunnableBuildingCache().run();
        System.out.println("Main done!");

        new Thread(new RunnableBuildingCache()).start();
        new Thread(new RunnableBuildingCache()).start();
        System.out.println("Running in seperate Thread completed!");
    }
}
