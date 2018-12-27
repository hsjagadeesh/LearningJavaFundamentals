package com.learning.java.commons;

import java.io.IOException;
import java.util.Scanner;

public class CodingPractice {

	public static void main(String[] args) throws IOException {

		Double result = (50 /3.5);
		System.out.println(result);
		
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		
		Scanner scanner = new Scanner(System.in);

		int read = scanner.nextInt();
		
		System.out.println(read * scanner.nextInt());
	}

}
