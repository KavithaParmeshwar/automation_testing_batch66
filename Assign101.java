/*Write a program with combination of super and this calling statement*/

package mkt.automation;

class B2
{
	B2(int a)
	{
		System.out.println("Constructor 1");
	}
	B2()
	{
		this(100);
		System.out.println("Constructor 2");
	}
}

public class Assign101 extends B2
{
	Assign101(int a, double b)
	{
		super();
		System.out.println("Constructor 3");
	}
	
	Assign101()
	{
		this(100, 23.4);
		System.out.println("Constructor 4");
	}
	
	public static void main(String[] args) 
	{
		new Assign101();
	}
}