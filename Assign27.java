package mkt.automation;	//Write a Program to call non parameterized Constructor Overloading

public class Assign27
{
	// non-parameterized constructor
	Assign27()
	{
		System.out.println("Default Constructor");
	}

	// parameterized constructor
	Assign27(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args)
	{
		// calling constructors
		new Assign27();      // non-parameterized
		new Assign27(10);    // parameterized
	}
}