/*Write a program to check if 2 arrays are same or not*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign140 
{
	public static void main(String[] args) 
	{
		int input[] = new int[4];
		input[0] = 1;
		input[1] = 17;
		input[2] = 4;
		input[3] = 27;

		int output[] = new int[input.length];

		for (int i = 0; i < input.length; i++)
		{
			output[i] = input[i];
		}

		System.out.println("Input Array is -> " + Arrays.toString(input));
		System.out.println("Output Array is -> " + Arrays.toString(output));

		if (Arrays.equals(input, output))
		{
			System.out.println("The Two arrays are EQUAL");
		}
		else
		{
			System.out.println("The Two arrays are NOT EQUAL");
		}
	}
}