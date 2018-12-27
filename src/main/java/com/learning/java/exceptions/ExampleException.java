package com.learning.java.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExampleException {

	public static void main(String[] args) {

		try {
			String name = null;
			name.toString();
		} catch (Exception e) {
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			System.out.println("Hello " + sw.toString());
		}
	}

}
