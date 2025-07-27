package com.homework.java;

public class FindArrayLargeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declares an integer array
		int [] number = {5,10,15,20};
		
		//code for print all array values 
		for (int i = 0; i < number.length; i++) {
		    System.out.println(number[i] + " ");
		}
		System.out.println(); // for new line 
		
		//code for print max number 
		 int max = number[0];
	        for (int i = 1; i < number.length; i++) {
	            if (number[i] > max) {
	                max = number[i];
	            }
	        }
	        
	        System.out.print("The maximum number is: " + max);
		
		//For-each loop This method provides a simpler way to iterate through the array
//		for (int num : number) {
//		    System.out.print(num + " ");
//		}
//	       
	}

}
