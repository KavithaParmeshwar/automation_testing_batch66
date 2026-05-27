/*Write a Program with all types of access specifier for instace global variable 
 * and try to access them outside the class however with in the package*/

package mkt.automation1;

import mkt.automation.Assign104;

public class Assign104P2 extends Assign104 
{
	public static void main(String[] args) 
	{
		System.out.println("Accessing from subclass in another package:");

		// public accessible
		System.out.println(a);

		// protected accessible via inheritance
		System.out.println(b);

		// default → not accessible
		// System.out.println(c); // ❌ error

		// private → not accessible
		// System.out.println(d); // ❌ error
	}
}