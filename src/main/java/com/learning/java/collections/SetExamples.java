package com.learning.java.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("One");
		hashSet.add(null);
		
		System.out.println(hashSet);

		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Jagadeesh");
		linkedHashSet.add("Nanda");
		linkedHashSet.add("Mananya");
		linkedHashSet.add("Tanush");

		System.out.println(linkedHashSet.add("Jagadeesh"));
		System.out.println(linkedHashSet.size());
		System.out.println(linkedHashSet);
		print(linkedHashSet);
		
		System.out.println("TREE SET");
		Set<String> sortedSetImpl = new TreeSet<String>();
		sortedSetImpl.add("jagadeesh");
		sortedSetImpl.add("Nanda");
		sortedSetImpl.add("mananya");
		sortedSetImpl.add("Tanush");
   
		System.out.println(sortedSetImpl);
		print(sortedSetImpl);
		
		Set<String> synchronizedSet = Collections.synchronizedSet(linkedHashSet);
		for (String string : synchronizedSet) {
			string += "Modified"; 
		}

		for (String string : linkedHashSet) {
			string += "Modified"; 
		}
	}
	
	public static void print(Set set) {
		
		set.stream().forEach(System.out :: println);
	}

}
