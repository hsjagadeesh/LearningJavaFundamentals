package com.learning.java.commons;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {

	public static void main(String[] args) {

//		reverseElements();
//		rotateElements(2);
//		reverseInGroup(3);
		
		mergeSortedLinkedList();
	}
	
	public static void mergeSortedLinkedList() {

		List<Integer> linkList = new LinkedList<Integer>();
		List<Integer> linkList1 = new LinkedList<Integer>();
		
		linkList1.add(1);
		linkList.add(2);
		linkList1.add(3);
		linkList.add(4);
		linkList1.add(5);
		linkList.add(6);
		linkList1.add(7);
		linkList1.add(8);
		linkList1.add(9);
		linkList.add(10);
		linkList.add(11);
		linkList.add(12);
		
//		linkList.addAll(linkList1);
//		linkList.sort((e1, e2) -> e1.compareTo(e2));
		
/*
		List<Integer> linkListFinal = new LinkedList<Integer>();
		
		int i=0, j=0, k=0;
		while(i < linkList.size() && j < linkList1.size()) {
			if(linkList.get(i) <= linkList1.get(j)) {
				linkListFinal.add(k, linkList.get(i));
				i++;
			} else {
				linkListFinal.add(k, linkList1.get(j));
				j++;
			}
			k++;
		}
		
		if(i <= linkList.size() -1) {
			while(i < linkList.size()) {
				linkListFinal.add(k, linkList.get(i));
				i++;
				k++;
			}
		} else {
			while(j < linkList1.size()) {
				linkListFinal.add(k, linkList1.get(j));
				j++;
				k++;
			}
		}
		
		System.out.println(linkListFinal.toString());
*/	
	}	

	public static void reverseInGroup(int groupSize) {

		List<Integer> linkList = new LinkedList<Integer>();
		
		linkList.add(1);
		linkList.add(2);
		linkList.add(3);
		linkList.add(4);
		linkList.add(5);
		linkList.add(6);
		linkList.add(7);
		linkList.add(8);
		linkList.add(9);
		linkList.add(10);
		linkList.add(11);
		linkList.add(12);
		
//		Index of element to print
//		2,1,0 
//		5,4,3 
//		8,7,6
		
		int incrementBy = 0;
		for(int i=0; i<linkList.size(); i=i+groupSize ) {
			for(int j=groupSize-1+incrementBy; j >=incrementBy; j--) {
				System.out.println(linkList.get(j));
			}
			incrementBy = incrementBy + groupSize;
		}
		
		
		
	}
	
	public static void rotateElements(int rotateBy) {
		List<Integer> linkList = new LinkedList<Integer>();
		
		linkList.add(1);
		linkList.add(2);
		linkList.add(3);
		linkList.add(4);

		for(int i=0; i<linkList.size(); i++){
			System.out.println((i+rotateBy)%linkList.size());
			System.out.println(linkList.get((i+rotateBy)%linkList.size()));
		}
		
	}

	
	public static void reverseElements() {
		List<Integer> linkList = new LinkedList<Integer>();
		
		linkList.add(1);
		linkList.add(2);
		linkList.add(3);
		linkList.add(4);

		for(int i=linkList.size()-1; i>=0; i--){
			System.out.println(linkList.get(i));
		}
		
	}
	
	public static void printCenterElement() {
		List<Integer> linkList = new LinkedList<Integer>();
		
		linkList.add(1);
		linkList.add(2);
		linkList.add(3);
		linkList.add(4);
//		linkList.add(5);
//		linkList.size()

		System.out.println(linkList.size()/2 + linkList.size()%2);
	}

}
