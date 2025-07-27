package com.homework.java;

public class MethodAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MethodAddition obj = new MethodAddition();
//		obj.argumentMethod(10,20);
		
		
		int num1 = 10;
		int num2 = 20;
		int total = argumentMethod(num1, num2);
		System.out.println(total);
		

	}
	public static int  argumentMethod(int a, int b) { //method takes two integer arguments 
		int sum = a+b;
		return sum;
	}

}
