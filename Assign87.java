//Write a Program on This Calling Statement

package mkt.automation;

class ConstructorCalling {

	// constructor 1
	ConstructorCalling() {
		this(10);   // calls parameterized constructor 2
		System.out.println("Default Constructor");
	}

	// constructor 2
	ConstructorCalling(int a) {
		System.out.println("Parameterized Constructor: " + a);
	}
}

public class Assign87 {
	public static void main(String[] args) {

		ConstructorCalling A87 = new ConstructorCalling();   // calls non parameterized constructor 1

	}
}