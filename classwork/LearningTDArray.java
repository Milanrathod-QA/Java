package com.classwork.java;

public class LearningTDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//                        0           1
		//                     0     1      0      1
		String [] [] name = {{"mr","mrs"},{"abc","xyz"}};
		System.out.println(name[0][0]+name[1][0]);	//mrabc
		System.out.println(name[0][1]+name[1][1]); //mrsxyz
		System.out.println(name[0][0]+name[1][1]); //mrxyz
		System.out.println(name[0][1]+name[1][0]);	//mrsabc
	}

}

//take a three variable and find the smallest number among of them
//Take a three variable and find the largest number among of them
//find the max number of int type array
//find min number of float array

