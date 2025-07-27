package com.homework.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeList {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("somnath");
		li.add("bhalka");
		li.add("bhidiya");
		li.add("hiran");
		li.add("triveni sangam");
		
		//print all list items
		for (String s : li) {
			//System.out.println(s);
			if (s.equals("hiran")){
				System.out.println("found");
				break;
			}//System.out.println(s);	
		}
		
		// here Call another method and pass the list
		getListElement(li);
		integerList();
	}
	
	//passing the List object as the argument.
	static void getListElement(List<String> li) {
		//get any list item with index value
		System.out.println(li.get(2));
		
		//update list items
		li.set(0, "dubai");
		System.out.println(li);
		
		//remove list items
		li.remove(2);
		System.out.println(li);
		
		 // Checking if element is present using contains()
		boolean isPresenet = li.contains("dubai");
		System.out.println("yes " + isPresenet);
		
		//get list size
		System.out.println("size of list is " + li.size());
	}

	static void integerList() {
		//List<Integer> l = new ArrayList<Integer>();
		List<Integer> l = Arrays.asList(10,20,30,125,0,1,5,8,9,1526);
		int s = l.size();
		System.out.println(s);
		System.out.println(l.get(5));
		
	}
		
}
