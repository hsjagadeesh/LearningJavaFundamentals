package com.learning.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> listStr = new ArrayList<String>();
		
		listStr.add("1");
		listStr.add("2");
		listStr.add("3");
		listStr.add("4");
//		listStr.add("5");
		
		Iterator<String> iterator = listStr.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			if(next.equalsIgnoreCase("2")) {
//				listStr.set(2, "Three");
				listStr.remove(next);
//				iterator.remove();
			}
		}
		System.out.println(listStr);
		
		
//		List<String> myList = new ArrayList<String>();
//		
//		myList.add("1");
//		myList.add("2");
//		myList.add("3");
//		myList.add("4");
//		myList.add("5");
//		
//		Iterator<String> it = myList.iterator();
//		while(it.hasNext()){
//			String value = it.next();
//			if(value.equals("2")) {
//				myList.remove(value);
//			}
//		}
//		
//		System.out.println(myList.size());
		
		
	}

}
