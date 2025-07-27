package com.homework.java;

public class MethodWithParamvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodWithParamvalue obj =  new MethodWithParamvalue();
		int result = obj.sub(50, 10);
		System.out.println(result);
	}
	
	 public int sub(int a, int b) {
	        return a - b;
	    }

}
