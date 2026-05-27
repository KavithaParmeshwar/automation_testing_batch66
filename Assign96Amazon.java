/*Write a Program on Constructor Chaining*/

package mkt.automation;

public class Assign96Amazon
{
	Assign96Amazon()
	{
		this(500);
		System.out.println("Constructor 1");
	}
	Assign96Amazon(int a)
	{
		System.out.println("Constructor 2");
	}
	Assign96Amazon(int a, double c)
	{
		this();
		System.out.println("Constructor 3");
	}

	public static void main(String[] args) 
	
	{
		new Assign96Amazon(10, 6.3);
	}
}