package com.learning.java.inheritance;

public class ClassB extends ClassA {

	static {
		System.out.println("B Static");	
	}
	
	ClassB() {
		System.out.println("B Constructor");
	}
}
