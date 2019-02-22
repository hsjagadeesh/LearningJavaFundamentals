package com.learning.java.inheritance;

public interface L0Interface {

	default void printSomething() {
		System.out.println(getClass().getName());
	}

	public static boolean isNull(String str) {
		System.out.println("Interface Null Check");
		return str == null ? true : "".equals(str) ? true : false;
	}
}
