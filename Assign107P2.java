/*Write a Program with all types of access specifier for static methods 
 * and try to access them from different class*/

package mkt.automation;

public class  Assign107P2
{
	public static void main(String[] args)
	{
		System.out.println("Accessing static methods from another class:");

		// public accessible
		Assign107.publicMethod();

		// protected accessible (same package)
		Assign107.protectedMethod();

		// default accessible (same package)
		Assign107.defaultMethod();

		// private NOT accessible
		// Assign107.privateMethod(); // ❌ error
	}
}