package com.classwork.java;

public class LearningBreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<10; i++) {
			if (i == 5) {
				System.out.println("i value is 5");
				//break;
				continue;
			}else {
				System.out.println(i);
			}
		}
	}

}
