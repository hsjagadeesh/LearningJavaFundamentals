package com.learning.java.commons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {

	public static void main(String[] args) throws ParseException {

		System.out.println(new Date());
		
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy");
		System.out.println(sdf.format(new Date()));
		
		sdf = new SimpleDateFormat("HH:MM a");
		System.out.println(sdf.format(new Date()));
		
//		sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.parse("14:33 PM"));
		
	}

}
