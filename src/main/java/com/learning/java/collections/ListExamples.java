package com.learning.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Jagadeesh");
		list.add("Nanda");
		list.add("Mananya");
		list.add("Tanush");
		
		for (String string : list) {
			string += "Modified";
//			list.add(string);
		}
		
		print(list);
	}
	
	public static void print(List list) {
//		list.stream().forEach(() -> (System.out::print()));
		list.forEach(System.out::println);
	}

}
