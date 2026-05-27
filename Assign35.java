package mkt.automation;

public class Assign35
{
	// global variables
	static int a = 50;	
	int b = 20;

	// static method
	static void staticMethod()
	{
		System.out.println("Static method:");
		System.out.println("Value of a = " + a);
	}

	// non-static method
	void nonStaticMethod()
	{
		System.out.println();
		System.out.println("Non-static method:");
		System.out.println("Value of b = " + b);
	}

	public static void main(String[] args)
	{
		staticMethod();

		Assign35 A35 = new Assign35();
		A35.nonStaticMethod();
	}
}