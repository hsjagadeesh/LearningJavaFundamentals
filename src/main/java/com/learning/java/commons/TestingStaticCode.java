package com.learning.java.commons;

/**
 * program to verify/confirm if static variable is init first or static block
 * 
 * @author jhosalaiahsadashi
 *
 */
public class TestingStaticCode {

	public static String name = "name";
	
	static {
		System.out.println("static block :" + name);
		name = "staticblock";
		System.out.println("static block :" + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
