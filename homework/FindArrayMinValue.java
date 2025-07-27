package com.homework.java;

public class FindArrayMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float  [] a= {10.10f, 20.2f};
		
		//code for print all array values 
				for (int i = 0; i < a.length; i++) {
				    System.out.println(a[i] + " ");
				}
				
			//code for print min values	
			float min = a[0];
		    for (int i = 1; i > a.length; i++) {
		           if (a[i] < min) {
		              min = a[i];
		           }
		       }
		      System.out.print("The min number is: " + min);
	}

}
