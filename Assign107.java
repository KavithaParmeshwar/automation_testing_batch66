/*Write a Program with all types of access specifier for static methods 
 * and try to access them from different class*/

package mkt.automation;

public class  Assign107
{
	public static void publicMethod() {
		System.out.println("PUBLIC static method");
	}

	// protected static method
	protected static void protectedMethod() {
		System.out.println("PROTECTED static method");
	}

	// default static method
	static void defaultMethod() {
		System.out.println("DEFAULT static method");
	}

	// private static method
	private static void privateMethod() {
		System.out.println("PRIVATE static method");
	}
}