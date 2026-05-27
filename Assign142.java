/*Write a Program to Check if the given Array if the value 100 is present at index also find out its indexing*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign142 
{

	public static void main(String[] args) 
	{

		int[] input = new int[7];
		input[0] = 45;
		input[1] = 86;
		input[2] = 100;
		input[3] = 90;
		input[4] = 100;
		input[5] = 65;
		input[6] = 42;

		int numberToCheck = 100;
		boolean found = false;

		for (int i = 0; i < input.length; i++) 
		{
			if (input[i] == numberToCheck) 
			{
				System.out.println("Yes, the given number is a part of the Array");
				System.out.println("At the given index -> " + i);
				found = true;
			}
		}

		if (!found) 
		{
			System.out.println("The given number is not present in the array.");
		}
	}
}