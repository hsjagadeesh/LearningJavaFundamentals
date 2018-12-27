package com.learning.java.dates;

public class DateExample {

	public static void main(String[] args) {

		java.util.Date juDate = new java.util.Date();
		java.sql.Date jsDate = new java.sql.Date(System.currentTimeMillis());
		java.sql.Timestamp jsTimestamp = new java.sql.Timestamp(System.currentTimeMillis());
		
		System.out.println(juDate);
		System.out.println(jsDate);
		System.out.println(jsTimestamp);
		
		System.out.println(juDate.getTime());
		System.out.println(jsDate.getTime());
		System.out.println(jsTimestamp.getTime());
		
	}

}
