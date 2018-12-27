package com.learning.java.domainobjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Circle implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2599837242965445918L;

	public Circle(Point p, int radius) {
		this.p = p;
		this.radius = radius;
	}
	
	private Point p;
	private int radius;
	
	public Point getP() {
		return p;
	}
	
	public void setP(Point p) {
		this.p = p;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void writeToFile(String filename) {
		
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		
		try {
			File file = new File(filename);
			fileOutputStream = new FileOutputStream(file);
			
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(this);
			
		} catch (IOException ioe) {
			System.out.println(ioe);
		} finally {
			if(fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(objectOutputStream != null) {
				try {
					objectOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public Circle readFromFile(String filename) {
		
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		Object readObject = null;
		try {
			fileInputStream = new FileInputStream(new File(filename));
			
			objectInputStream = new ObjectInputStream(fileInputStream);
			readObject = objectInputStream.readObject();
		} catch (IOException ioe) {
			System.out.println(ioe);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(objectInputStream != null) {
				try {
					objectInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return (Circle) readObject;
	}
	
	@Override
	public String toString() {
		return "Circle with point P " + this.getP() + 
		" and radius: " + this.getRadius();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;
		}
		
		Circle circleObject = (Circle) obj;
		
		if(this.getP() != circleObject.getP()) {
			return false;
		}
		
		if(this.getRadius() != circleObject.getRadius()) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode()
				+ this.getP().hashCode()
				+ this.getRadius();
	}
}
