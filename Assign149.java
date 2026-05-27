/*Write a program to Check if the given string ends with 'e' string "axe"*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign149 
{
	public static void main(String[] args) 
	{
		String input = "axe";

		if (input.endsWith("e")) 
		{
			System.out.println("Yes, the string starts with 'e'");
		} else {
			System.out.println("No, the string does NOT start with 'e'");
		}
	}
}