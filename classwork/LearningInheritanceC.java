package com.classwork.java;
					//child					//per
public class LearningInheritanceC extends LearingInheritanceB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningInheritanceC learningInheritanceC = new LearningInheritanceC();
		learningInheritanceC.substraction();
		learningInheritanceC.multiplication();
		
		System.out.println(" ");
		LearingInheritanceB learingInheritanceB = new LearingInheritanceB();
		learingInheritanceB.multiplication();
		
		learningInheritanceC.addition();
	}
	public void substraction() {
		c=a-b;
		System.out.println(c);
	}
	

}
