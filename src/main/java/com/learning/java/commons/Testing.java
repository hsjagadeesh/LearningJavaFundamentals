package com.learning.java.commons;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Testing {

	public static void main(String[] args) {

		double doubleValue = ((Double) Double.parseDouble("0")).doubleValue();
		
		if(doubleValue == 0) {
			System.out.println("true");
		}
		List<String> names = new ArrayList<String>();

		names.add("Jaga");
		names.add("Manu");
		names.add("Unknown");
		names.add("Tanu");

		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();

			if (name.equals("Unknown")) {
				iterator.remove();
			}
			
			if(name.equals("Manu")) {
				names.add("Mananya");
			}
		}
		
		for (String string : names) {
			System.out.println(string);
		}

	}

}
