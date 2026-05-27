/*Write a Program with all types of access specifier for non static methods 
 * and try to access them with in the same class*/

package mkt.automation;

public class Assign110 
{
	private void privateMethod() 
	{
		System.out.println("Private Non-Static Method");
	}

	void defaultMethod() 
	{
		System.out.println("Default Non-Static Method");
	}

	protected void protectedMethod() 
	{
		System.out.println("Protected Non-Static Method");
	}

	public void publicMethod() 
	{
		System.out.println("Public Non-Static Method");
	}

	public static void main(String[] args) 
	{

		// Creating object to access non-static methods
		Assign110 obj = new Assign110();

		obj.privateMethod();
		obj.defaultMethod();
		obj.protectedMethod();
		obj.publicMethod();
	}
}