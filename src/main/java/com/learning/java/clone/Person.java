package com.learning.java.clone;

public class Person implements Cloneable {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
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
