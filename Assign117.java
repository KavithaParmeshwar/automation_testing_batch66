/*Write a Program with all types of access specifier for constructor and
 *  try to access them outside the package without becoming the sub class*/

package mkt.automation;

public class Assign117 
{

	public Assign117(int a) 
	{
		System.out.println("Public Constructor: " + a);
	}

	protected Assign117(double b) 
	{
		System.out.println("Protected Constructor: " + b);
	}

	Assign117(String msg) 
	{
		System.out.println("Default Constructor: " + msg);
	}

	private Assign117() 
	{
		System.out.println("Private Constructor");
	}
}