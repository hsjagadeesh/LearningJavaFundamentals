package com.learning.java.hackerrank.sorting;

import java.util.*;

class Student implements Comparator {

	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student && o2 instanceof Student) {
			double gpaDiff = ((Student) o2).getCgpa() - ((Student) o1).getCgpa();
			if(gpaDiff != 0.0) {
				return (int) gpaDiff;
			}

			int compare = ((Student) o1).getFname().compareTo(((Student) o2).getFname());
			if(compare != 0) {
				return compare;
			}

			return ((Student) o1).getId() - (((Student) o2).getId());

		} else {
			return 0;
		}
	}
}

//Complete the code
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}

		Collections.sort(studentList, new Student(1, "name", 1));

		Collections.sort(studentList,
				Comparator.comparing(Student::getCgpa).reversed()
					.thenComparing(Student::getFname)
					.thenComparing(Student::getId)
				);

      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



