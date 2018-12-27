package com.learning.java.inheritance;

public class L2ClassImpl implements L1InterfaceA, L1InterfaceB {

	// @Override
	// public void printSomething() {
	// System.out.println("L2ClassImpl : " + getClass().getName());
	// }

	public static void main(String[] args) {
		L2ClassImpl object = new L2ClassImpl();
		object.printSomething();

		L1InterfaceA interfaceAObj = new L2ClassImpl();
		interfaceAObj.printDefaultMethod();
	}

	@Override
	public void printSomething() {
		// TODO Auto-generated method stub
		L1InterfaceB.super.printSomething();
	}

}
