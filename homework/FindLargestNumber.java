package com.homework.java;

public class FindLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a = 10;
		int b = 5;
		int c = 0;
		
		
		//Find the largest number using Math.max() method 
		int largest = Math.max(Math.max(a, b),c);
		System.out.println("Largest number is: " + largest);
		
		//Example how to define this method for  5 values
		//<Datatype> largest = Math.max(Math.max(Math.max(num1, num2), num3), Math.max(num4, num5));
		
        		

		//Find the largest number using if else statment
/*		if(a>=b && a>=c) {
			System.out.println( "Largest number is " + a);
		}else if(b>=a && b>=c) {
			System.out.println("Largest number is " + b);
		}
		else {
			System.out.println("Largest number is " + c);
		}*/
	
	}

}
