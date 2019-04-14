package com.learning.java.inheritance;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ChildClass extends BaseClass {

	public static void main(String[] args) {
		new ChildClass().getData();
	}

	@Override
	public ArrayList getList() throws RuntimeException  {
		System.out.println("Child Class");
		return null;
	}
	
	@Override
	public void getData() throws ArrayIndexOutOfBoundsException {
		System.out.println("Child Class");
	}
	
	@Override
	protected void throwCheckedException() throws RuntimeException {
		System.out.println("Child Class");
	}
}
