package com.homework.java;

import java.util.HashMap;
import java.util.Map;

public class JavaDuplicateInstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "my name is duplicate, duplicate is not so good. diplicate leads to unwanted memory usage";
		  /*  String[] arr1 = s1.split(" ");
		    int count = 0;

		    for (int i = 0; i < arr1.length; i++) {
		        count = 0;

		        for (int j = 0; j < arr1.length; j++) {
		            String temp = arr1[j];
		            String temp1 = arr1[i];

		            if (j < i && temp.contentEquals(temp1)) {
		                break;

		            }
		            if (temp.contentEquals(temp1)) {
		                count = count + 1;

		            }

		            if (j == arr1.length - 1) {
		                System.out.println(arr1[i] +  count);

		            }

		        }
		    }*/
		
		 //Map<String, Integer> hashMap = new HashMap<>();
		 HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

	        String[] words = s1.split(" ");

	        for (String word : words) {
	            // containsKey(key) will return a boolean value
	            // i.e. true if it contains the key and false if
	            // it doesn't.
	            if (hashMap.containsKey(word))
	                hashMap.put(word, hashMap.get(word) + 1);

	            else
	                hashMap.put(word, 1);
	        }

	        System.out.println(hashMap);
	    }
}