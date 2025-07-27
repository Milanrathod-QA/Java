package com.classwork.java;

public class LearningString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "It Is a First String";
		String s2 = "This Is a Second String"; 
		
		//Upper and lower case
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		//starts and ends with
		boolean start = s1.startsWith("It");
		System.out.println(start);
		
		boolean end = s2.endsWith("@");
		System.out.println(end);
		
		//replace 
		String s3 = s1.replace("i","@");
		System.out.println(s3);
		
		//substring
		String s4 = s2.substring(0,12);
		System.out.println(s4);
		
		System.out.println(" ");
		//split string
		String[] s5 = s1.split(" ");
		for (int i=0; i<s5.length; i++) {
			System.out.println(s5[i]);
		}
		
		System.out.println(" ");
		//conver string to character array
		char[] s6 = s2.toCharArray();
		for(int i=0; i<s6.length; i++) {
			System.out.println(s6[i]);
		}
		
		System.out.println(" ");
		//equals comparision
		String s7 = "Google Chrome";
		String s8 = "Chrome";
		if (s7.equals(s8)) {
			System.out.println("matched");
		}else {
			System.out.println("Not matchd");
		}
		
		//Partial comparision
		if (s7.contains(s8)) {
			System.out.println("partialy matched");
		}else {
			System.out.println("partialy Not matchd");
		}
	}
	
}