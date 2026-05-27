package mkt.automation;

public class Assign38	
{
	// static global variable
	static int a = 10;

	// non-static global variable
	int b = 20;

	public static void main(String[] args) 
	{
		// creating object for non-static variable
		Assign38 obj = new Assign38();

		// updating static variable
		a = 50;

		// updating non-static variable
		obj.b = 100;


		System.out.println("Static Vaiable: " + a);
		System.out.println("Non Static Vaiable: " + obj.b);
	}
}