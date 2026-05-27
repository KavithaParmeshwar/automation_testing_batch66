/*Write a program for constructor inheritance- Multi level using a 
 * parameterized super calling statement with explicit invocation*/

package mkt.automation;

class GrandParent
{
	GrandParent(int a)
	{
		System.out.println("GrandParent Constructor: " + a);
	}
}

class Parent1 extends GrandParent
{
	Parent1(int a, int b)
	{
		super(a);   // Explicitly calling GrandParent constructor
		System.out.println("Parent Constructor: " + b);
	}
}

public class Assign95 extends Parent1
{
	Assign95(int a, int b, int c)
	{
		super(a, b);   // Explicitly calling Parent constructor
		System.out.println("Child Constructor: " + c);
	}

	public static void main(String[] args)
	{
		new Assign95(10, 20, 30);
	}
}