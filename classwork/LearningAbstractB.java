package com.classwork.java;

public class LearningAbstractB extends LearningAbstractA  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		LearningAbstractB learningAbstractB = new LearningAbstractB();
		learningAbstractB.animal();
		learningAbstractB.cat();
	}

	@Override
	public void cat() {
		// TODO Auto-generated method stub
		System.out.println("This is cat method");
	}

}
