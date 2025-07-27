package com.classwork.java;

public class LearningEncapsulation {
	
	String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningEncapsulation learningEncapsulation = new LearningEncapsulation();
		learningEncapsulation.setName("Hello");
		
		System.out.println(learningEncapsulation.getName());
	}
	public void setName(String firstName) {
		name = firstName;
	}
	
	public String getName() {
		return name;
	}
}