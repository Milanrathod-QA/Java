package com.classwork.java;

import java.util.Scanner;

public class LeaningUserinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Please enter yourage");
		int age = sc.nextInt();
		System.out.println("Age entered by user is:" + age);
		
		
		System.out.println("Please enter your name:");
		
		String name = sc.next();
		System.out.println("name enterd by user is: " + name);
		sc.close();
	}

}
