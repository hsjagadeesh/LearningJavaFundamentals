package com.learning.java.reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args){
	        Class student = Student.class;
	        Method[] methods = student.getDeclaredMethods();
	
	        ArrayList<String> methodList = new ArrayList<>();
	        for(int i=0; i<methods.length; i++){
	            methodList.add(methods[i].getName());
	        }
	        
	        Collections.sort(methodList);
	        for(String name: methodList){
	            System.out.println(name);
	        }
	        
	        System.out.println("using Java 8 feature of stream!!!");
	        Stream.of(Student.class.getDeclaredMethods())
	        .map(Method::getName)
	        .sorted()
	        .forEach(System.out::println);
    }

}