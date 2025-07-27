package com.homework.java;

import java.util.Scanner;

public class PercentageOfUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of subjects");
		
		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		Double c = sc.nextDouble();
		Double d = sc.nextDouble();
		Double Total = a+b+c+d; 
		System.out.println("Total mark is " + Total);
		
		Double persentage = (Total/4);
		System.out.println("Per is " + persentage);
				
	}

}
