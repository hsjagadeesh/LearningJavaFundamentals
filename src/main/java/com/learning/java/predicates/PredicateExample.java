package com.learning.java.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static int totalValues(List<Integer> values, Predicate<Integer> predicate) {
		int total = values.stream()
//				.filter(predicate::test)
				.filter(predicate)
				.reduce(0, (c, e) -> c+e);
		return total;
	}
	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		
		System.out.println(totalValues(values, e -> true));
		System.out.println(totalValues(values, e -> e % 2 == 0));
	}

}
