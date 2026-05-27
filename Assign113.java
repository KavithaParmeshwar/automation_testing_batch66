/*Write a Program with all types of access specifier for non static methods and 
 * try to access them outside the package without becoming the sub class*/

package mkt.automation;

public class Assign113 
{
	private void privateMethod() {
		System.out.println("Private Method");
	}

	void defaultMethod() {
		System.out.println("Default Method");
	}

	protected void protectedMethod() {
		System.out.println("Protected Method");
	}

	public void publicMethod() {
		System.out.println("Public Method");
	}

	// Method to test access within same class
	public void callAllMethods() {
		privateMethod();
		defaultMethod();
		protectedMethod();
		publicMethod();
	}
}