/*Write a Program with all types of access specifier for constructor 
 * and try to access them from different class */

package mkt.automation;

public class Assign115P2 {

	// Public constructor
	public Assign115P2(int a) {
		System.out.println("Public Constructor: " + a);
	}

	// Protected constructor
	protected Assign115P2(double b) {
		System.out.println("Protected Constructor: " + b);
	}

	// Default constructor
	Assign115P2(String msg) {
		System.out.println("Default Constructor: " + msg);
	}

	// Private constructor
	private Assign115P2() {
		System.out.println("Private Constructor");
	}

	// Method to access private constructor
	public static void createPrivateObject() {
		Assign115P2 obj = new Assign115P2();
	}
}

public class Assign115P2 {
    public static void main(String[] args) {

        Assign115 obj1 = new Assign115(10);        // public
        Assign115 obj2 = new Assign115(20.5);      // protected
        Assign115 obj3 = new Assign115("Hello");   // default

        // Not allowed
        // Assign115 obj4 = new Assign115(); // ERROR

        Assign115.createPrivateObject(); // accessing private constructor
    }
}

import mkt.automation.Assign115;

public class Assign115P3 {
    public static void main(String[] args) {

        Assign115 obj1 = new Assign115(100); // Only public works

        // Not allowed
        // Assign115 obj2 = new Assign115(10.5);
        // Assign115 obj3 = new Assign115("Hi");
    }
}

import mkt.automation.Assign115;

public class ChildClass extends Assign115 {

    public ChildClass() {
        super(50.5); // protected constructor
    }

    public static void main(String[] args) {

        ChildClass obj = new ChildClass();

        Assign115 obj1 = new Assign115(200); // public

        // Not allowed
        // Assign115 obj2 = new Assign115("Test");
    }
}