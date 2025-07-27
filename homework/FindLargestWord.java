package com.homework.java;

public class FindLargestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "My name is Rajnandiniba chudasama ";
		System.out.println(s1);
		
		String[] word = s1.split(" "); // Split the string into words
	    String maxlethWord = ""; // Initialize the largest word variable
	    for(int i = 0; i < word.length; i++){
	            if(word[i].length() >= maxlethWord.length()){
	                  maxlethWord = word[i];
	            } 
	    }
	     System.out.println(maxlethWord);
	}

}
