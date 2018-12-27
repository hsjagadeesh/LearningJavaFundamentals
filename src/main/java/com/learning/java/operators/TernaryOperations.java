package com.learning.java.operators;

public class TernaryOperations {

	public static void main(String[] args) {
		String str1 = "Test";
		String str2 = "TestValue";
		
		System.out.println(str1 == null && str2.length() > 0 ? str2 : "null");

	}

}
