package com.learning.java.inheritance;

public interface L0Interface {

	default void printSomething() {
		System.out.println(getClass().getName());
	}
}
