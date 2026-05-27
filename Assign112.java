/*Write a Program with all types of access specifier for non static methods and 
 * try to access them outside the package by becoming the sub class*/

package mkt.automation;

public class Assign112 
{
	private void privateMethod() {
		System.out.println("Private method");
	}

	void defaultMethod() {
		System.out.println("Default method");
	}

	protected void protectedMethod() {
		System.out.println("Protected method");
	}

	public void publicMethod() {
		System.out.println("Public method");
	}
}