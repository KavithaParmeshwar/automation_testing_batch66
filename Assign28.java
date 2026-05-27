package mkt.automation;		//Write a Program to call parameterized Constructor Overloading

public class Assign28
{
	// parameterized constructor
	Assign28(int a)
	{
		System.out.println(a);
	}

	// parameterized constructor
	Assign28(int b, int c)
	{
		System.out.println(b+c);
	}

	public static void main(String[] args)
	{
		// calling constructors
		new Assign28(10);      // parameterized
		new Assign28(10+20);    // parameterized
	}
}