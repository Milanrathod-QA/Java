package com.classwork.java;

public class LearningInterfaceC implements LearningInterfaceA,LearningInterfaceB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningInterfaceC learningInheritanceC = new LearningInterfaceC();
		learningInheritanceC.activa();
		learningInheritanceC.honda();
	}

	@Override
	public void activa() {
		// TODO Auto-generated method stub
		System.out.println("Activa");
	}

	@Override
	public void honda() {
		// TODO Auto-generated method stub
		System.out.println("Honda");
	}

}
