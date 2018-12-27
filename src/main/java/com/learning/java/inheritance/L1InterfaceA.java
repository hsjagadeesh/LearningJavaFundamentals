package com.learning.java.inheritance;

public interface L1InterfaceA {

	default void printDefaultMethod() {
		System.out.println("L1InterfaceA : printDefaultMethod " );
	}
}
