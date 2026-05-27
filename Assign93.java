/*Write a program for constructor inheritance using the 
 * super calling statement with Explicit Invocation*/

package mkt.automation;

class Tenant1
{
	Tenant1()
	{
		System.out.println("Tenant Constructor");
	}
}

public class Assign93 extends Tenant1
{
	Assign93()
	{
		System.out.println("Owner Constructor");
	}

	public static void main(String[] args)
	{
		new Assign93();
	}
}