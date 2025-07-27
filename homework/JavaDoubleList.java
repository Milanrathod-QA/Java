package com.homework.java;

import java.util.ArrayList;
import java.util.List;

public class JavaDoubleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> DL = new ArrayList<Double>();
		DL.add(40.32);
		DL.add(12.24);
		DL.add(18.32);
		DL.add(99.36);
		
		/*if(DL.contains(12.24)) {
			System.out.println("Found");
			return;
		}else {
			System.out.println("not found");
		}*/
		
		for(Double value : DL) {
		if(value.equals(11)) {
			System.out.println("found");
			break;
		}else {
			System.out.println("not found");
		}
		
	}
		
	}

}
