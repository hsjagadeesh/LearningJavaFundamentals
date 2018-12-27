package com.learning.java.commons;

import java.util.Scanner;

public class MetricsConversion {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		inchesToMeter();
	}

	public static void inchesToMeter() {
		int inch = scanner.nextInt();
		
		System.out.println(inch + " Inches is " + inch * 0.0254 + " Meters");
	}
}
