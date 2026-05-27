/*Write a program for Reverse a String by using String Functions*/

package mkt.automation;

public class Assign128 
{
	public static void main(String[] args) 
	{
		String st1 = "Welcome to Bengaluru";
		String reverse = "";

		for (int i = st1.length()-1; i >= 0; i--) 
		{
			reverse = reverse + st1.charAt(i);
		}

		System.out.println("Given Original String: " + st1);
		System.out.println("Reversed String: " + reverse);
	}
}