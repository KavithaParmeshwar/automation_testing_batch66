/*Write a Program with all types of access specifier for static methods 
 * and try to access them outside the package without becoming the sub class*/

package mkt.automation;

public class Assign109 
{

	private static void privateMethod() 
	{
		System.out.println("Private Static Method");
	}

	static void defaultMethod() 
	{
		System.out.println("Default Static Method");
	}

	protected static void protectedMethod() 
	{
		System.out.println("Protected Static Method");
	}

	public static void publicMethod() 
	{
		System.out.println("Public Static Method");
	}

	public static void main(String[] args) 
	{
		// Access inside same class
		privateMethod();
		defaultMethod();
		protectedMethod();
		publicMethod();
	}
}