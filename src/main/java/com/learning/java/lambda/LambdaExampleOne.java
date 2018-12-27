package com.learning.java.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import com.learning.java.domainobjects.Person;

public class LambdaExampleOne {

	public static void main(String[] args) {
		
		List<Person> lstOfPersons = Arrays.asList(
				new Person("Jaga", "HS", 35),
				new Person("Mahe", "M", 36),
				new Person("Vids", "HN", 25),
				new Person("Manu", "J", 3)
			);

//		Comparator<Person> comparator = (Person p1, Person p2) -> return p1.getLastName().compareTo(p2.getLastName())+;
		Collections.sort(lstOfPersons, (p1, p2) ->  { 
						return p1.getLastName().compareTo(p2.getLastName()); 
					} 
				);
		
//		print all names
		lstOfPersons.forEach((e) -> System.out.println(e.toString()));
		
//		print selected names
		printConditionally(lstOfPersons, (p) -> {
			return p.getFirstName().startsWith("M");
		});
	}	

	static void printConditionally(List<Person> lstOfPersons, Predicate<Person> predicate) {
		for (Person person : lstOfPersons) {
			if(predicate.test(person)) {
				System.out.println(person.toString());
			}
		}
	}	
}