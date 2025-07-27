package com.homework.java;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading methodOverloading = new MethodOverloading();
		methodOverloading.add(10.5, 20);
		methodOverloading.add(20, 30);
		
	}

	public void add(int a, int b) {
		//return (a + b);
		System.out.println(a+ b);
	}	
	
	public void add(double a, double b) {
		System.out.println(a+b);
	}
}
