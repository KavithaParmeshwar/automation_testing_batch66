/*WAP to create relation between 2 classes having non-static methods using extends keyword. 
 *Single Level Inheritance from 2 different program*/

package mkt.automation;

class P74
{
	void display()
	{
		System.out.println("Non-static method from Parent class");
	}
}

public class Assign74 extends P74
{
	void show()
	{
		System.out.println("Non-static method from Child class");
	}

	public static void main(String[] args)
	{
		Assign74 A74 = new Assign74();  // Object creation

		A74.display(); // Parent class method
		A74.show();    // Child class method
	}
}