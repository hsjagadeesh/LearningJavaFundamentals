package com.learning.java.commons;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;

public class ArraysExample {
	
	public static class CompareAsString<Integer> implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			String string = o1.toString();
			String string2 = o2.toString();
			
			return string2.compareTo(string);
		}
		
	}

	public static void main(String[] args) {
		char[] charArray = {'a','c','f','g','t','y'};
		System.out.println(new String(charArray));
		
		Integer[] intArray = {3, 30, 34, 5, 9};
		Arrays.sort(intArray, new CompareAsString<Integer>());
		System.out.println(Arrays.toString(intArray));
	}
	
	public static void removeDuplicatesInArray() {
		Integer[] integerArr = {2017, 2013, 1981, 1987, 2018, 1981, 1987, 2018};
		LinkedHashSet<Integer> linkedHashset = new LinkedHashSet<Integer>();
		linkedHashset.addAll(Arrays.asList(integerArr));
		Object[] array = linkedHashset.toArray();
		System.out.println(Arrays.toString(array));
	}
	
	
	
	public static void reverseArrays() {
		Integer[] integerArr = {2017, 2013, 1981, 1987, 2018};
		
		for(int i=0, j=integerArr.length; ; i++, j--) {
			if(i>=j){ 
				break;
			}
			int temp = integerArr[i]; 
			integerArr[i] = integerArr[j-1];
			integerArr[j-1] = temp;
		}
		
		System.out.println(Arrays.toString(integerArr));
	}
	
	public static void sortIntegers() {
		Integer[] integerArr = {2017, 2013, 1981, 1987};
		Arrays.sort(integerArr);
		System.out.println(Arrays.toString(integerArr));
	}
	
	public static void sortStrings() {
		String[] stringArr = {"Jagadeesh", "Nanda", "Tanush", "Mananya"};
		Arrays.sort(stringArr);
		System.out.println(Arrays.toString(stringArr));
	}
	
	
	
	

}
