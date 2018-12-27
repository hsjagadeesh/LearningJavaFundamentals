package com.learning.java.serialization;

import com.learning.java.domainobjects.Circle;
import com.learning.java.domainobjects.Point;

public class SerializationExample {

	public static void main(String[] args) {

		Circle circle = new Circle(new Point(10, 20), 10);
		
		circle.writeToFile("TestingFilename.txt");
		
		Circle readFromFile = circle.readFromFile("TestingFilename.txt");
		
		System.out.println(readFromFile.equals(circle));
	}

}
