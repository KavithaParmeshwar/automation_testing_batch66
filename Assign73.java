/*WAP to create relation between 2 classes having static methods using extends keyword. 
 * Single Level Inheritance from 2 different program*/

package mkt.automation;

class P73
{
	static void display()
	{
		System.out.println("Static method from Parent class");
	}
}

public class Assign73 extends P73
{
	static void show()
	{
		System.out.println("Static method from Child class");
	}

	public static void main(String[] args)
	{
		display(); // Parent class static method
		show();    // Child class static method
	}
}