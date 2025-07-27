package com.classwork.java;

import java.util.HashMap;

public class LearningHasmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> student = new HashMap<Integer, String>();
		student.put(1, "milan");
		student.put(2, "shreyansh");
		student.put(3, "karan");
		student.put(4, "ravi");
		student.put(4, "abc");
		
		System.out.println(student);
		System.out.println(student.size());
		//student.clear();
		System.out.println(student);
		
	}

}