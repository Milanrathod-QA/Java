package com.homework.java;

class Parent {
    // Protected variable
    protected String message = "Hello from Parent!";

    // Protected method
    protected void showMessage() {
        System.out.println(message);
    }
}

// Subclass
class Child extends Parent {
    // Method in the subclass
    public void display() {
        // Accessing the protected variable from the Parent class
        System.out.println("Child accessing: " + message);
        
        // Accessing the protected method from the Parent class
        showMessage();
    }
}


public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child =new Child();
		child.display();
	}

}
