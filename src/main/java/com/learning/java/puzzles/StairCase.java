package com.learning.java.puzzles;

public class StairCase {

	public static void main(String[] args) {
		StairCase(4);

	}

	static void StairCase(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < n - i - 1) {
					System.out.print(".");
				} else {
					System.out.print("#");
				}
			}

			System.out.println();
		}
	}

}
