package com.homework.java;

public class MethodWithSubstraction {

	//do the sub using argument + return type
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodWithSubstraction sub = new MethodWithSubstraction();
		sub.subMethod(20, 5);
		
	}
	
	public void subMethod(int a, int b) {
		//return sub = int a - int b;
		System.out.println(a-b);
	}

}
