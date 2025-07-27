package com.classwork.java;

public class LearningConstructor {

	public LearningConstructor() {
		System.out.println("This is no argument constructor");
	}
	
	public LearningConstructor(int a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//same as class name
		//con..args has no return type
		LearningConstructor learningConstructor = new LearningConstructor();
		LearningConstructor learningConstructor2 = new LearningConstructor(10);
	}
	

}
