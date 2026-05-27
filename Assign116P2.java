/*Write a Program with all types of access specifier for constructor and
 *  try to access them outside the package by becoming the sub class*/


package mkt.automation1;

import mkt.automation.Assign116;

public class Assign116P2 extends Assign116 {

	// Constructor of subclass
	public Assign116P2() {

		// Accessible
		super(10.5); // protected constructor

		// NOT Accessible
		// super("Hello"); // default → ERROR
		// super();        // private → ERROR
	}

	public static void main(String[] args) {

		Assign116P2 obj = new Assign116P2();

		// Accessible
		Assign116 obj1 = new Assign116(100); // public

		// NOT Accessible
		// Assign116 obj2 = new Assign116(20.5); // protected (no direct access)
		// Assign116 obj3 = new Assign116("Hi"); // default
	}
}