/*Write a program for constructor inheritance using the 
 * super calling statement with Explicit Invocation*/

package mkt.automation;

class Tenant
{
	Tenant(int a)
	{
		System.out.println("Tenant Constructor: " + a);
	}
}

public class Assign94 extends Tenant
{
	Assign94(int a, int b)
	{
		super(a);   // Explicitly calling Parent constructor
		System.out.println("Owner Constructor: " + b);
	}

	public static void main(String[] args)
	{
		new Assign94(10, 20);
	}
}