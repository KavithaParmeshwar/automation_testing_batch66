/*WAP to create relation between 2 classes having static methods using extends keyword. 
 * Single Level Inheritance from 2 different package*/

package mkt.automation1;

import mkt.automation.Assign75;

public class Assign75P2 extends Assign75
{
	public static void show()
	{
		System.out.println("Child class static method");
	}

	public static void main(String[] args)
	{
		display(); // Calling parent class method
		show();    // Calling child class method
	}
}