package com.homework.java;

import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//create scanner object
		
		 System.out.print("Enter the size of the array: ");
	      int size = sc.nextInt();
	      
	    //Declare array based on entered size
	     int[] array = new int[size];
	     System.out.println("Enter the elements of the array:");
	     
	     for (int i = 0; i < size; i++) {
	            array[i] = sc.nextInt();
	        }
	     
	     //code for print all array elements
	     for (int i = 0; i < array.length; i++) {
			    System.out.println(array[i] + " ");
			}
	     
	    //find max values 
	     int max = 0;
	     for(int i = 0; i< array.length; i++) {
	    	 if(array[i] > max) {
	    		 max = array[i];
	    	 }
	    	 
	    	 
	     }
	     System.out.println("The maximum value is: " + max);
	   //find max values 
	     /*int min = 0;
		    for (int i = 0; i > array.length; i++) {
		           if (array[i] < min) {
		              min = array[i];
		           }
		       }
		    System.out.println("The min value is: " + min);*/
		    
		    sc.close(); //close scanner class 
	     
	     
	     		
	}

}
