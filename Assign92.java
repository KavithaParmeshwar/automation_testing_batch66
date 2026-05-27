/*Write a program on Parameterized this calling statement*/

package mkt.automation;

class Assign92
{
	Assign92(int a)
	{
		System.out.println("Constructor 1: " + a);
	}

	Assign92(int a, int b)
	{
		this(a);   // Calling parameterized constructor
		System.out.println("Constructor 2: " + b);
	}

	public static void main(String[] args)
	{
		new Assign92(10, 20);
	}
}