package com.learning.java.inheritance;

import java.io.IOException;

public class TestingInheritance {

	public static void main(String[] args) throws Exception {
		BaseClass bc = new ChildClass();
		bc.getList();
		bc.getData();
		bc.throwCheckedException();
	}

}
