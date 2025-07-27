package com.classwork.java;

import java.util.ArrayList;

public class LearningArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Array = has fix data type 
//		Array list = any type of datatype int,float,double		
//		
		ArrayList number = new ArrayList();
		number.add(20.5f);
		number.add(false);
		number.add(50);
		
		System.out.println(number);
//		System.out.println(number.size());   //print arraylist length
		
		number.remove(1);
		System.out.println(number);
	}

}
