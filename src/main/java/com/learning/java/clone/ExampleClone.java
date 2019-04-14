package com.learning.java.clone;

public class ExampleClone {

	/**
	 * By cloning
	 *
	 * Shallo Copy:
	 * 	Standard Data 	-> Data get's Copied
	 * 	Objects			-> Reference get's Copied.
	 *
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {

		Person person = new Person("Jaga", 36);
		person.setAddress(Address.builder()
				.street("3707 Poinciana Dr")
				.build());
		System.out.println(person);
		Person clonePerson = (Person) person.clone();
		System.out.println(clonePerson);

		clonePerson.getAddress().setCity("Santa Clara");
		System.out.println(person.getName() == (clonePerson.getName()));

		clonePerson.setName("Test");
		clonePerson.getAddress().setCity("Sunnyvale");

		System.out.println(clonePerson.getName());
		System.out.println(clonePerson.getAddress().getCity());

		System.out.println(person.getName());
		System.out.println(person.getAddress().getCity());
	}

}
