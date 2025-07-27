package com.homework.java;

public class PracticeMultidimesonalArray {

	public static void main(String[] args) {
		//                            0                  1
		//                      0           1       0        1
		String [][] name = {{"somnath","hiran"},{"bhalka","bhidiya"}};
		System.out.println(name[0][0] +" "+name[1][0]);
		System.out.println(name[0][1]); //hiran
		System.out.println(name[1][0]); //bhalka
		
		//print all array values
		for (int i = 0; i < name.length; ++i) {
	        for(int j = 0; j < name[i].length; ++j) {
	           System.out.println(name[i][j]);
	        }
}
}
}