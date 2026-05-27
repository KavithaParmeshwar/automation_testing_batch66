/*Write a program on this calling statement multi-level inheritance*/

package mkt.automation;

class Assign90
{
	Assign90()
	{
		this(100);
		System.out.println("Constructor 1");
	}

	Assign90(int a)
	{
		this(10,3.5);   
		System.out.println("Constructor 2");
	}

	Assign90(int a, double b)
	{
		System.out.println("Constructor 3");
	}
	
	public static void main(String[] args)
	{
		new Assign90();
	}
}