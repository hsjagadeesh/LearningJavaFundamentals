package com.learning.java.clone;

public class ExampleClone {

	public static void main(String[] args) throws CloneNotSupportedException {

		Person person = new Person("Jaga", 36);
		System.out.println(person);
		Person clonePerson = (Person) person.clone();
		System.out.println(clonePerson);
		
		System.out.println(person.getName() == (clonePerson.getName()));
	}

}
