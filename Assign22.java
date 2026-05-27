package mkt.automation;

public class Assign22 
{
	static void add(int a)
	{
		System.out.println("without one parameter");
	}
	static void add(int a, int b)
	{
		System.out.println("with two parameters");
	}
	void add(int a, int j, int c)
	{
		System.out.println("with three parameters");
	}
	void add(int a, int j, int c, int d)
	{
		System.out.println("with four parameters");
	}

	public static void main(String[] args) 
	{
		Assign22 A22 = new Assign22();
		add(10);
		add(10,20);
		A22.add(10,20,30);
		A22.add(10,20,30,40);
	}
}