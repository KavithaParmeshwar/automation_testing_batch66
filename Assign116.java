/*Write a Program with all types of access specifier for constructor and
 *  try to access them outside the package by becoming the sub class*/

package mkt.automation;

public class Assign116 {

	// Public constructor
	public Assign116(int a) {
		System.out.println("Public Constructor: " + a);
	}

	// Protected constructor
	protected Assign116(double b) {
		System.out.println("Protected Constructor: " + b);
	}

	// Default constructor
	Assign116(String msg) {
		System.out.println("Default Constructor: " + msg);
	}

	// Private constructor
	private Assign116() {
		System.out.println("Private Constructor");
	}
}