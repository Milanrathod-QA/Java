package com.homework.java;

public class TaskVariables {
		/*-----subtraction using global variable-----*/
		int d = 20;
		int e = 20;
		int c = d-e;
		
		static int alpha = 5;  //Declare static variable using static keyword
		static int beta = 10;
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*-----Addition using local variable-------*/ 
		int a = 10;
		int b = 10;
		System.out.println("Addition using local variable" + " " + (a+b));	//print simple addition with two integer values
		
		TaskVariables obj = new TaskVariables();  // Creating object of class 
		obj.sub();  //call the method
		
		System.out.println("mul using static variable" + " " + (alpha*beta));	//execute static variable
	}
	public void sub(){	//method creating
		System.out.println("Sub using global variable"+ " " + c);
	}

}
