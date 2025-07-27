package com.homework.java;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse string
				String s1 = "My name is khan";
				String reverse = new StringBuilder(s1).reverse().toString();
				System.out.println("my name is khan");
				System.out.println(reverse);
				
				System.out.println(" ");
				
				
				// Split the input string into words
		        String[] words = s1.split(" ");
		        
		        // StringBuilder to hold the output
		        StringBuilder output = new StringBuilder();
		        // Reverse each word and append to output
		        for (String word : words) {
		            String reversedWord = new StringBuilder(word).reverse().toString();
		            output.append(reversedWord).append(" ");
		        }
		        System.out.println("My nameis khan");
		        // Trim trailing space and print output
		        System.out.println(output.toString().trim());
	}

}
