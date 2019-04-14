package com.learning.java.threads;

import java.util.concurrent.Callable;

public class CallableBuildingCache implements Callable<String> {

    @Override
    public String call() throws Exception {
        for(int i=0; i<10; i++) {
            System.out.println("Building Cache");
        }
        return "Done!";
    }
}
