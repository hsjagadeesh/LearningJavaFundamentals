package com.learning.java.inheritance;

public interface L1InterfaceB {

	default void printSomething() {
		System.out.println(getClass().getName());
	}
}
