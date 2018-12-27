package com.learning.java.optionals;

import java.util.Optional;
import java.util.Random;

public class User {
	
	public static void main(String[] args) {
		getUser();
	}

	public static Optional<User> getUser() {
		User user = null;
		double random = new Random().nextInt(10);
		System.out.println(random);
		
		boolean value = Math.round((random%2))==0;
		System.out.println(value);
		
		if(value) {
			user = new User();
		}
		
		System.out.println("User object is " + user);
		return Optional.ofNullable(user);
	}
}
