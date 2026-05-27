/*Write a program to Check if the given string consist of exact 3 letters string"axe"*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign147 
{
	public static void main(String[] args) 
	{
		String input = "axe";

		if (input.equals("axe") && input.length() == 3)
		{
			System.out.println("The given string is exactly 'axe' with 3 letters.");
		}
		else
		{
			System.out.println("The given string is NOT 'axe'.");
		}
	}
}