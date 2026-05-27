/*Write a Program with all types of access specifier for global variable 
and try to access them with in the same class*/

package mkt.automation;

class Assign97 
{
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	int d = 40;

	public void display1()
	{
		System.out.println("Public variable a: " + a);
	}
	
	private void display2()
	{
		System.out.println("Private variable b: " + b);
	}
	
	protected void display3() 
	{
		System.out.println("Protected variable c: " + c);
	}
	
	void display4()
	{
		System.out.println("Default variable d: " + d);
	}
	
	public static void main(String[] args) 
	{
		Assign97 A97 = new Assign97();
		A97.display1();
		A97.display2();
		A97.display3();
		A97.display4();
	}
}