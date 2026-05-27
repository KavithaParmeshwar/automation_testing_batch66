/*Write a Program with all types of access specifier for instance global variable 
 * and try to access them with in the same class*/

package mkt.automation;

public class Assign102 
{

	// global variables with different access specifiers
	public static int a = 10;      // accessible everywhere
	protected static int b = 11;   // accessible in same package + subclasses
	static int c = 12;             // default (package-private)
	private static int d = 13;     // accessible only inside this class

	public static void main(String[] args) 
	{
		// accessing all variables within the same class
		System.out.println("Public variable a = " + a);
		System.out.println("Protected variable b = " + b);
		System.out.println("Default variable c = " + c);
		System.out.println("Private variable d = " + d);
	}
}