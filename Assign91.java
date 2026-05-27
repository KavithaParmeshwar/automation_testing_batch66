/*Write a program on Parameterized this calling statement*/

package mkt.automation;

class Assign91
{
	Assign91()
	{
		System.out.println("Non Parameterized 1");
	}

	Assign91(int a)
	{
		this();   //	calling parameterized constructor
		System.out.println("Parameterized Constructor 2");
	}

	public static void main(String[] args)
	{
		new Assign91(100);
	}
}