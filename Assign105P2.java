/*Write a Program with all types of access specifier for instance global variable 
 * and try to access them outside the package without becoming the sub class*/

package mkt.automation1;

import mkt.automation.Assign105;

public class Assign105P2
{
	public static void main(String[] args) 
	{

		System.out.println("Accessing from another package WITHOUT inheritance:");

		// public → accessible
		System.out.println(Assign105.a);

		// protected → NOT accessible (no subclass)
		// System.out.println(Assign105.b); // ❌ error

		// default → NOT accessible
		// System.out.println(Assign105.c); // ❌ error

		// private → NOT accessible
		// System.out.println(Assign105.d); // ❌ error
	}
}