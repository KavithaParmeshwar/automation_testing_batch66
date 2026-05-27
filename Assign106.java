/*Write a Program with all types of access specifier for static methods 
 * and try to access them with in the same class inside package*/

package mkt.automation;

public class  Assign106
{
	public static void publicMethod() 
	{
		System.out.println("This is PUBLIC static method");
	}

	// protected static method
	protected static void protectedMethod() 
	{
		System.out.println("This is PROTECTED static method");
	}

	// default static method
	static void defaultMethod() 
	{
		System.out.println("This is DEFAULT (package-private) static method");
	}

	// private static method
	private static void privateMethod() 
	{
		System.out.println("This is PRIVATE static method");
	}

	public static void main(String[] args) 
	{

		System.out.println("Accessing all static methods inside same class:");

		publicMethod();
		protectedMethod();
		defaultMethod();
		privateMethod();
	}
}