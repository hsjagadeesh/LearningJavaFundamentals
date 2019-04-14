package com.learning.java.clone;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@Getter
@Setter
public class Person implements Cloneable {

	private String name;
	private int age;
	private Address address;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
////
//		Object object = super.clone();
//		((Person) object).setName(this.name.toString());
//		((Person) object).setAge(this.age);
//		return object;

	}

}
