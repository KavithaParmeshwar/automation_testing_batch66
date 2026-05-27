/*Write a Program with all types of access specifier for constructor 
 * and try to access them from different class */

package mkt.automation;

public class Assign115 {

	// Public constructor
	public Assign115(int a) {
		System.out.println("Public Constructor: " + a);
	}

	// Protected constructor
	protected Assign115(double b) {
		System.out.println("Protected Constructor: " + b);
	}

	// Default constructor
	Assign115(String msg) {
		System.out.println("Default Constructor: " + msg);
	}

	// Private constructor
	private Assign115() {
		System.out.println("Private Constructor");
	}

	// Method to access private constructor
	public static void createPrivateObject() {
		Assign115 obj = new Assign115();
	}
}