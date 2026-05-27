/*Write a Program with all types of access specifier for constructor and 
 * try to access them with in the same class inside package*/

package mkt.automation;

public class Assign114P2 
{
	public static void main(String[] args) 
	{

		Assign114 obj1 = new Assign114(20);      // public
		Assign114 obj2= new Assign114("Hi");    // protected
		Assign114 obj3 = new Assign114(3.14);    // default

		// Not allowed (private)
		// Assign114 obj4 = new Assign114(); // ❌ ERROR
	}
}