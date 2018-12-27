package com.learning.java.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SortingUser {

	public static void main(String[] args) {
		
		User jags = new User("Jags", "Pword", 35);
		User Ashe = new User("Ashe", "Pword", 35);
		User Mahe = new User("Mahe", "Pword", 35);
		User jags2 = new User("Jags", "Pword", 34);
		
		List<User> userList = new ArrayList<User>();
		
		userList.add(jags);
		userList.add(Ashe);
		userList.add(Mahe);
		userList.add(jags2);
		
//		Collections.sort(userList);
		
		for (User user : userList) {
			System.out.println(user.getUsername());
		}
		
//		Collections.sort(userList, new UserComparator());
		
		userList.sort((user1, user2) -> {
				if(user1.getUsername().equals(user2.getUsername())) {
					return user1.getAge().compareTo(user2.getAge());
				} else {
					return user1.getUsername().compareTo(user2.getUsername());
				}
			}
		);
		
		
		for (User user : userList) {
			System.out.println(user.getUsername() + " " + user.getAge());
		}
		

	}

}
