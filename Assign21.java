package mkt.automation;

public class Assign21 
{
	void add(int a)
	{
		System.out.println("without one parameter");
	}
	void add(int a, int b)
	{
		System.out.println("with two parameters");
	}
	void add(int a, int j, int c)
	{
		System.out.println("with three parameters");
	}

	public static void main(String[] args) 
	{
		Assign21 A21 = new Assign21();
		A21.add(10);
		A21.add(10,20);
		A21.add(10,20,30);
	}
}