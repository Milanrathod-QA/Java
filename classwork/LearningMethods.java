package com.classwork.java;

public class LearningMethods {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningMethods learningMethods = new LearningMethods(); //object
		learningMethods.argumentMethod(10);
		
		learningMethods.noargumentMethod();
		
		System.out.println(learningMethods.getName());
		
		learningMethods.noreturntypeMethod();
		staticMethod();
		learningMethods.nonstaticMethod();
	}
	//Argument method
	public void argumentMethod(int a){
		System.out.println(a);
	}
	
	//noargumentMethod
	public void noargumentMethod() {
		System.out.println("This is noargument Method");
	}
	
	//returntypeMethod  
	public String getName() {
		return "milan";
	}
	
	//noreturntypeMethod
	public void noreturntypeMethod() {
		System.out.println("this is noreturntype Method");
	}
	
	//ststicMethod
	public static void staticMethod() {
		System.out.println("This is static Method");
	}
	
	//nonstaticMethod
	public void nonstaticMethod() {
		System.out.println("This is nonstatic Method");
	}
	
}
//do the addition using argument + static + return type 
//do the sub using argument + return type