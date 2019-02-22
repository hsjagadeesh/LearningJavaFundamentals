package com.learning.java.exceptions;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named BubbleSort. */
        Scanner scanner = new Scanner(System.in);
        String numerator = scanner.nextLine();
        String denominator = scanner.nextLine();
        
        try {
            int nume = Integer.parseInt(numerator);
            int deno = Integer.parseInt(denominator);
            
            System.out.println(nume/deno);
        } catch (Exception e) {

//        } catch (NumberFormatException nfe) {
//        	System.out.println("java.util.InputMismatchException");
//        } catch (ArithmeticException ae) {
//        	System.out.println("java.lang.ArithmeticException: / by zero");
        }
         
    }
}
