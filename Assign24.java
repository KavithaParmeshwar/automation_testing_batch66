package mkt.automation;

public class Assign24
{    
	//static methods

	static void add(int a, int b)
	{
		System.out.println(a + b);
	}

	static void add(int a, int b, int c)
	{
		System.out.println(a + b + c);
	}

	static void add(double a, double b)
	{
		System.out.println(a + b);
	}

	static void add(int a, double b)
	{
		System.out.println(a + b);
	}

	static void add(double a, int b)
	{
		System.out.println(a + b);
	}

		
	// non static methods
	
	void multiply(int a, int b)
	{
		System.out.println();
		System.out.println(a * b);
	}

	void multiply(int a, int b, int c)
	{
		System.out.println(a * b * c);
	}

	void multiply(double a, double b)
	{
		System.out.println(a * b);
	}

	void multiply(int a, double b)
	{
		System.out.println(a * b);
	}

	void multiply(double a, int b)
	{
		System.out.println(a * b);
	}


	public static void main(String[] args)
	{
		add(10, 20);
		add(10, 20, 30);
		add(10.5, 20.5);
		add(10, 5.5);
		add(5.5, 10);

		Assign24 A24 = new Assign24();

		A24.multiply(5, 4);
		A24.multiply(2, 3, 4);
		A24.multiply(2.5, 3.5);
		A24.multiply(5, 2.5);
		A24.multiply(2.5, 5);
	}
}