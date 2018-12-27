package com.learning.java.optionals;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		
		Optional<User> user = User.getUser();
		System.out.println(user.get());
		if(user.isPresent()) {
			System.out.println(user.get());
		} else { 
			System.out.println("user is null");
		}
		
	}

}
