package com.learning.java.domainobjects;

import java.io.Serializable;

public class Point implements Serializable {

	private static final long serialVersionUID = -303228827857916141L;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "this.getX(): " + this.getX() + "\n" +
				"this.getY(): " + this.getY();
	}
	
	@Override
	public boolean equals(Object object) {
		if(object == null) {
			return false;
		}
		
		if (!(object instanceof Point)) {
			return false;
		} 

		Point point = (Point) object;
		
		return this.getX() == point.getX() &&
				this.getY() == point.getY();
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() 
				+ this.getX() 
				+ this.getY(); 
	}
	
}
