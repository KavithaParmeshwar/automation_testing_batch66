/*Write a program to check if the given string starts with 'a'string"axe"*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign148 
{
	public static void main(String[] args) 
	{
		String input = "axe";

		if (input.startsWith("a")) 
		{
			System.out.println("Yes, the string starts with 'a'");
		} else {
			System.out.println("No, the string does NOT start with 'a'");
		}
	}
}