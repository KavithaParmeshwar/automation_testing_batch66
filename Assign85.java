/*Write a program for constructor inheritance- single level 
 * using a parameterized super calling statement with explicit invocation*/

package mkt.automation;

class Director85 {
	Director85(int a) {
		System.out.println("Constructor 1");
	}

	Director85() {
		System.out.println("Constructor 2");
	}
}

class Manager1 extends Director {
	Manager1(int a, double b) {
		super(100);   // calls Director()
		System.out.println("Constructor 3");
	}

	Manager1() {
		this(100, 23.4);
		System.out.println("Constructor 4");
	}
}
public class Assign85 {
	public static void main(String[] args) {
		new Manager1();
	}
}