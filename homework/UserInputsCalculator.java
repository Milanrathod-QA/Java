package com.homework.java;

import java.util.Scanner;

public class UserInputsCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//create scanner object
		
		/*-----------------------Addition using Floating points numbers-----------------*/
		/*System.out.println("Addition for floating values");
		System.out.println("Enter value");
		float a = sc.nextFloat();
		
		System.out.println("enter value");
		float b = sc.nextFloat();
		
		System.out.println("addition of " + a +" and " +b +"is"+" "+(a+b));*/
		
		/*---------------------multiplication-------------------*/
		System.out.println("Multiplication using Dounle");
		System.out.println("Enter value");
		Double c = sc.nextDouble();
		
		System.out.println("Enter value");;
		Double d = sc.nextDouble();
		System.out.println("Multiplaction of " +c + " and " + d + " = " + (c*d));
		
		
		/*-------------------Div-------------------*/
		System.out.println("Division using int");
		System.out.println("Enter value");
		int e = sc.nextInt();
		System.out.println("Enter value");
		int f = sc.nextInt();
		System.out.println("Division of "+e+" and "+f+ " = "+ (e/f));
		
		/*----------------------Subs-----------------*/
		System.out.println("Substraction using long");
		System.out.println("Enter value");
		long g = sc.nextLong();
		System.out.println("Enter value");
		long h = sc.nextLong();
		System.out.println("Sub of "+g+" and "+g+ " = "+ (g-h));
		
		sc.close();
		
		
	
		
		
		
	}

}
