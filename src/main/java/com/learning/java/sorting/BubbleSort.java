package com.learning.java.sorting;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BubbleSort {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int numberOfItems = a.length;
        if(numberOfItems == 0) {
            return;
        }

        int numberOfSwap = 0;
        int temp = 0;
        boolean swapped = false;
        for(int i=0; i<numberOfItems; i++) {
            swapped = false;
            for(int j=i+1; j<numberOfItems; j++) {
                if(a[i] > a[j]) {
                    swapped = true;
                    numberOfSwap++;
                    System.out.println(numberOfSwap);
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;    
                }
            }
            if(!swapped) {
                break;
            }
        }

        System.out.println("Array is sorted in " + numberOfSwap +" swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[numberOfItems-1]);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
