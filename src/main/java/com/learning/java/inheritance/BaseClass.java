package com.learning.java.inheritance;

import java.io.IOException;
import java.util.List;

public class BaseClass {

	public List getList() throws Exception {
		System.out.println("Base Class");
		return null;
	}
	
	public void getData() throws RuntimeException {
		System.out.println("Base Class");
	}
	
	protected void throwCheckedException() throws Exception {
		System.out.println("Child Class");
	}
}
