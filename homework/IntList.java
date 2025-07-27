package com.homework.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a list of integer
		List<Integer> number = new ArrayList<>();
		number.add(11);
		number.add(22);
		number.add(33);
		number.add(44);
		number.add(55);	
		
		//to check 11 is available in ths list
		if(number.contains(11)) {
			System.out.println("Found");
			return;
		}else {
			System.out.println("not found");
		}
		
	}

}
//contain() is a method to check if a specific element is present in a collection, such as a List,Set,Map 