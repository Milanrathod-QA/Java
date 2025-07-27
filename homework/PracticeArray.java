package com.homework.java;

import java.util.Arrays;

import javax.naming.StringRefAddr;

public class PracticeArray {

	public static void main(String[] args) {
		/*PracticeArray practiceArray = new PracticeArray();
		practiceArray.newArray();*/
		
		int[] Array = {10,20,30,50,60};
		System.out.println(Arrays.toString(Array)); //to print all array as string 
		
		//code for print all array values 
				for (int i = 0; i < Array.length; i++) {
				    System.out.println(Array[i] + " ");
				}
				newArray();	
				largeArray();
				sortingArray();
	}
	
	static void newArray() {
		String[] arr = {"one","Alpha","three","four"};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorting array is " + Arrays.toString(arr));
	}
	
	static void largeArray() {
		int[] maxArray = {410,20,330,50,60};
		
		// Assume the first element is the largest initially
		int max = maxArray[0]; 
        
		// Iterate from the second element to the end of the array
        for (int i = 1; i < maxArray.length; i++) {
            if (maxArray[i] > max) {
                max = maxArray[i]; // Update max if a larger element is found
            }
        }
        System.out.println("The largest element is: " + max);
	}
	
	static void sortingArray() {
		int[] sortArray = {410,20,330,50,60};
		Arrays.sort(sortArray);
		System.out.println("Sorted array is " + Arrays.toString(sortArray));
	}
	
	

}
