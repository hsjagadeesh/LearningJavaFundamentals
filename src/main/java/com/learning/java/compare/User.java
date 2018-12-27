package com.learning.java.compare;

public class User 
//		implements Comparable<User>
		{

	private String username;
	private String password;
	private Integer age;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public User(String uname, String pword, Integer age) {
		this.username = uname;
		this.password = pword;
		this.age = age;
	}
	
/*	@Override
	public int compareTo(User o) {
		return this.getUsername().compareTo(o.getUsername());
	}
*/	
}
