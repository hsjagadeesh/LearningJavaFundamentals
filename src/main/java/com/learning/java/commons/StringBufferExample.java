package com.learning.java.commons;

public class StringBufferExample {

	public static void main(String[] args) {

		StringBuffer strBuffer = new StringBuffer("Jagadeesh");
		StringBuffer delete = strBuffer.delete(4, 5);
		System.out.println(delete);
		
	}

}
