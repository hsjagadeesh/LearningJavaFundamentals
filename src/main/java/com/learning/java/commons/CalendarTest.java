package com.learning.java.commons;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*

The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. Your task is to find what the day is on that date.

Input Format

A single line of input containing the space separated month, day and year, respectively, in   format.

Constraints

Output Format

Output the correct day in capital letters.

Sample Input

08 05 2015
Sample Output

WEDNESDAY
Explanation

The day on August th  was WEDNESDAY.
*/
 
public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, 8-1);
		calendar.set(Calendar.DAY_OF_MONTH, 5);
		calendar.set(Calendar.YEAR, 2015);
		
		
		System.out.println(calendar.getTime());
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
		System.out.println(sdf.format(calendar.getTime()).toUpperCase());
		
		switch (calendar.get(Calendar.DAY_OF_WEEK)) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thu");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;

		default:
			break;
		}

	}

}
