/*Write a program to Check if the given string have the letter 'u' in it. String "manishtiwari"*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign150 
{
	public static void main(String[] args) 
	{
		String input = "manishtiwari";

		boolean found = false;

		for (int i = 0; i < input.length(); i++) 
		{

			if (input.charAt(i) == 'u') 
			{
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("Yes, the string contains 'u'");
		} else {
			System.out.println("No, the string does NOT contain 'u'");
		}
	}
}