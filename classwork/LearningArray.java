package com.classwork.java;

public class LearningArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array is Non-primitive data type
		int [] number = new int[4]; //Declar length
		number [0] = 10;
		number [1] = 20;
		number [2] = 30;
		number [3] = 40;
		
		for (int i = 0; i< number.length; i++) {
			System.out.println(number [i]); 		//number [i] its call 'number of i'
		}
	}

}
