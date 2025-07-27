package com.homework.java;

import java.util.Arrays;
import java.util.List;

public class SimpleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a list that has values bat, ball, football, hockey and baseball. If hockey is found then break the loop
		List<String> game = Arrays.asList("bat","ball","football","hockey","baseball");
		for (String getName : game) {
			if(getName.equals("hockey")) {
				System.out.println("hockey is found");
				break;
			} else {
				System.out.println(getName);
			}
		}
		
		System.out.println(" ");
		System.out.println(" ");
		
		//a list that has values fb, insta, tik-tok, moj and mx taka-tak. If moj is found then break the loop.
		List<String> socialmedia = Arrays.asList("fb","insta","tiktok","moj");
		for (String getName : socialmedia) {
			if(getName.equals("moj")) {
				System.out.println("moj is found");
				break;
			} else {
				System.out.println(getName);
			}
		}
		
		System.out.println(" ");
		List<Double> DV = Arrays.asList(20.5,30.5);
		for (Double getName : DV) {
			if(getName == (20.3)) {
				System.out.println("is found");
				break;
			} else {
				System.out.println(getName);
			}
		}
	}

}

//integer,float value compare with == not to .equal
