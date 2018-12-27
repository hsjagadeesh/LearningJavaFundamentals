package com.learning.java.general;

public class OrderOfPrecedence {

	public static void main(String[] args) {
		int i = 2+3+3*11;
		System.out.println(i);
		
		String a = "THis";
		a +=( " Test");
		
		System.out.println(a);
		
		if(false && 1 == 1) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
