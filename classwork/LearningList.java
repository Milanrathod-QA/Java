package com.classwork.java;

import java.util.Arrays;
import java.util.List;

public class LearningList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("amazon","netflix","zee5","hotstar");
		for (String getName : names) {
			if(getName.equals("zee5")) {
				System.out.println("zee5 is found");
				break;
			} else {
				System.out.println(getName);
			}
		}
	}
//.equals method ,  
//== operator ,
	
}
