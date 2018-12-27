package com.learning.java.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaBasicExample {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		values.forEach((value) -> System.out.println(value));
	}

}
