package mkt.automation;

public class Assign37 
{
	static int a=100;	//Global variable
	static int b=10;	//Global variable
	static void sum()
	{
		int c=a+b;
		System.out.println(c);
	}
	static void difference()
	{
		int c=a-b;
		System.out.println(c);
	}

	void product()
	{
		int e=a*b;
		System.out.println(e);
	}

	public static void main(String[] args) 
	{
		sum();
		difference();
		Assign37 A37 = new Assign37();
		A37.product();

	}
}