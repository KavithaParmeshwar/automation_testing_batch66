/*Write a program for constructor inheritance- Multi level 
using a parameterized super calling statement with explicit invocation*/

package mkt.automation;

class Grandparent {
	Grandparent(int a) {
		System.out.println("Constructor 1");
	}

	Grandparent() {
		this(100);
		System.out.println("Constructor 2");
	}
}

class Parent extends Grandparent {
	Parent(int a, double b) {
		super();   // calls Grandparent()
		System.out.println("Constructor 3");
	}

	Parent() {
		this(100, 23.4);
		System.out.println("Constructor 4");
	}
}

class Child extends Parent {
	Child() {
		super();   // calls Parent()
		System.out.println("Constructor 5");
	}
}

public class Assign86 {
	public static void main(String[] args) {
		new Child();
	}
}