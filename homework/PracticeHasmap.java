package com.homework.java;

import java.util.HashMap;

public class PracticeHasmap {

	public static void main(String[] args) {
		//HashMap stores items in key/value pairs, where each key maps to a specific value.
		HashMap<Integer, String> data = new HashMap<Integer, String>();
		data.put(25, "Gujarat");
		data.put(12, "Rajasthan");
		data.put(30, "Assam");
		data.put(80, "Keral");
		
		// here Call another method and pass the object of hasmap
		getValues(data);
	}
	
	//passing the HasMap object as the argument.
	static void getValues(HashMap<Integer, String> data) {
		System.out.println(data);
	
		System.out.println(data.get(25));
	}

}
