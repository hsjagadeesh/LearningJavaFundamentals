package com.learning.java.fundamentals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast implements Runnable {

    List<StringBuilder> listOfNames = new ArrayList<StringBuilder>();

    public static void main(String[] args) {

        FailFast failFast = new FailFast();

        failFast.listOfNames.add(new StringBuilder("Jagadeesh"));
        failFast.listOfNames.add(new StringBuilder("Nanda"));
        failFast.listOfNames.add(new StringBuilder("Mananya"));
        failFast.listOfNames.add(new StringBuilder("Tanush"));

        Iterator<StringBuilder> iterator = failFast.listOfNames.iterator();

        new Thread(failFast).start();

        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
//            System.out.println(failFast.listOfNames.size());
        }

        System.out.println(failFast.listOfNames.size());
    }

    @Override
    public void run() {
        listOfNames.remove(3);
    }
}
