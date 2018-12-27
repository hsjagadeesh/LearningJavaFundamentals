package com.learning.java.collections;

import java.util.Arrays;
import java.util.List;

import com.learning.java.domainobjects.Person;

public class CollectionIteration {

	public static void main(String[] args) {
		List<Person> lstOfPersons = Arrays.asList(
				new Person("Jaga", "HS", 35),
				new Person("Mahe", "M", 36),
				new Person("Vids", "HN", 25),
				new Person("Manu", "J", 3)
			);
		
		lstOfPersons.forEach(System.out :: println);

	}

}
