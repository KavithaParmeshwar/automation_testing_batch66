/*Write a program for single-level inheritance using a static 
method in the single package explorer.*/

package mkt.automation;

class P71
{
	static void show()
	{
		System.out.println("Static method from Parent class");
	}
}

public class Assign71 extends P71
{
	public static void main(String[] args)
	{
		show();   // Calling static method from parent class
	}
}