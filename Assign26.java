package mkt.automation;

public class Assign26
{
	// constructor - non parameterized
	Assign26(char x)
	{
		System.out.println(x);
	}

	// static method
	static void display(int a, int b)
	{
		System.out.println(a+b);
	}

	// non static method
	void show(String msg)
	{
		System.out.println(msg);
	}

	public static void main(String[] args)
	{
		display(10, 20);

		// syntax of creating an object of the constructor, were it will be called automatically
		Assign26 A26 = new Assign26('K');

		// calling non static method
		A26.show("Hello Java");
	}
}