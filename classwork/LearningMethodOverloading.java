package com.classwork.java;

public class LearningMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//run time polymorphisam 
		//one obj has many forms
		//compile time polymor...  
		//method name same but arguments are diff
		LearningMethodOverloading learningMethodOverloading = new LearningMethodOverloading();
		learningMethodOverloading.methodOverload(10);
		
		learningMethodOverloading.methodOverload("hello");
	}
	public void methodOverload(int a) {
		System.out.println(a);
	}

	public void methodOverload(String a) {
		System.out.println(a);
	}
}
