package com.classwork.java;

public class LearningMethodOverridingB extends LearningMethodOverridingA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method same argu diff
		//runtimr poly,,,
		LearningMethodOverridingB learningMethodB = new LearningMethodOverridingB();
		learningMethodB.animal();
	}
	public void animal() {
		System.out.println("This is method overriding from B class");
	}

}
//overloading and overri