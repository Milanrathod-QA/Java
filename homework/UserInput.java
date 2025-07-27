package com.homework.java;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		System.out.println("Java program to taking input from user");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter Age");
		int b = sc.nextInt();
		sc.nextLine(); // Consume the newline character left by nextInt()
		 
		System.out.println("Eneter name");
		String name = sc.nextLine();
		
		System.out.println("hi"+ " " + name + " " + "Your age is " + b);
		
		sc.close();		

	}

}
