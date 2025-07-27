package com.classwork.java;

public class LearningVariables {
		int b = 20; //it is a global varibale 
		static int c = 30; //it is static variable
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable means allocated space in memory
		//1. local variable 2.global  3.Static
		
		
		int a = 10; // it is a local variable 
		System.out.println(a);
		
		LearningVariables learningVariables = new LearningVariables();
		learningVariables.add();
		//System.out.println(b);  //it will give the error because 'b' is a non static variable
		System.out.println(c);
	} 
	
	public void add() {
		System.out.println(b);
		System.out.println(c);
	}
		//Objec syntax
	//classname objectname  = new classname
	
	//How to call method
	//Objectname.methodname();
	
	//Do the addition using local variable 
	//Do the subs using global variable 
	//Do the mul using static variable
}
