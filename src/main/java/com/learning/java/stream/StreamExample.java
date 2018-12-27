package com.learning.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.learning.java.domainobjects.Person;

public class StreamExample {

	public static void main(String[] args) {
		
		StreamExample se = new StreamExample();
		
		List<Person> lstOfPersons = Arrays.asList(
				new Person("Jaga", "HS", 35),
				new Person("Mahe", "M", 36),
				new Person("Vids", "HN", 25),
				new Person("Manu", "J", 3)
			);

		List<String> collect = lstOfPersons.stream()
					.map((person) -> {
						return se.testing(person);
					})
					.collect(Collectors.toList());
		
		for (String string : collect) {
			System.out.println(string);
		}		
	}
	
	public String testing(Person person) {
		System.out.println("Testing");
		return person.getFirstName();
	}


}
