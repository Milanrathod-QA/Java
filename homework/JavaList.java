package com.homework.java;

import java.util.Arrays;
import java.util.List;

public class JavaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("india","Brazil","USA","russia","UK");
		for(String getName : names) {
			if(getName.equals("Brazil")) {
				System.out.println("found");
				break;
			}
			System.out.println(getName);
		}
		
	}

}
