package com.learning.java.commons;

import java.nio.charset.Charset;
import java.util.StringTokenizer;

public class StringExample {

	public static void main(String[] args) {
//		reverseText("This is a good Text");
//		reverseString("This is a good Text");

		String str1 = "GeeksForGeeks"; 
		String str2 = "For";
		
		System.out.println(str1.indexOf(str2));
		
	
	}
	
	public static void reverseText(String text) {
		StringTokenizer stringTokenizer = new StringTokenizer(text, " ");
		while(stringTokenizer.hasMoreTokens()) {
			reverseString(stringTokenizer.nextToken());
		}
	}
	
	public static void reverseString(String str) {
		String reverseString = "";
		char[] charArray = str.toCharArray();
		int i=charArray.length-1;
		while(i >= 0) {
			reverseString += Character.toString(charArray[i--]);
		}
		System.out.println(reverseString);
	}
	
	public static void printByteArray() {
		String name = new String("Jaga");
		byte[] bytes = name.getBytes(Charset.forName("UTF-8"));
		for (byte b : bytes) {
			System.out.print(b + " ");
		}
		System.out.println();
	}

}
