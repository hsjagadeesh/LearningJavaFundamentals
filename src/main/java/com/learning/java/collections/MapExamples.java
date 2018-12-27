package com.learning.java.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

import com.learning.java.domainobjects.Person;

public class MapExamples {

	public static void main(String[] args) {

		Map<String, Person> hm = new HashMap<String, Person>();

		hm.put("One", new Person("Jaga", "Hosa", 35));
		hm.put("Two", new Person("Manu", "Jaga", 4));
		hm.put("Three", new Person("Tanu", "Jaga", 0));
		print(hm);
		
		System.out.println("-------------TREE MAP---------------");
		Map<String, Person> tm = new TreeMap<String, Person>();
		tm.put("One", new Person("Jaga", "Hosa", 35));
		tm.put("Two", new Person("Manu", "Jaga", 4));
		tm.put("Three", new Person("Tanu", "Jaga", 0));
		tm.put(null, null);
		print(hm);
		
		Map<String, Person> linkedMap = new LinkedHashMap<String, Person>();
	}
	
	public static void print(Map map) {
		map.forEach((k,v) -> {
			System.out.println("Key :" +  k);
			System.out.println("Value :" +  v);
			System.out.println();
		});
		System.out.println("################################################");
	}

}
