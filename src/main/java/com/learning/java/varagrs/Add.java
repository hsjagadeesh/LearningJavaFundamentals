package com.learning.java.varagrs;

public class Add {

    public void add(int... intArray) {
        if(intArray == null) {
            return;
        }
        int sum = 0;
        for(int i=0; i<intArray.length; i++) {
            System.out.print(intArray[i]);
            sum += intArray[i];
            if(i != intArray.length-1) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
            }
        }
        
        System.out.println( sum );
        
    }
}
