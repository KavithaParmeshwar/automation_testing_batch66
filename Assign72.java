/*Write a program for single-level inheritance using a static 
method in the single package explorer.*/

package mkt.automation;

class P72
{
	void show()
	{
		System.out.println("Non-static method from Parent class");
	}
}

public class Assign72 extends P72
{
	public static void main(String[] args)
	{
		Assign72 A72 = new Assign72();  // Object creation
		A72.show();   // Calling parent class method
	}
}