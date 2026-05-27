/*Write a Program to reverse an array*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign138 
{
	public static void main(String[] args) 
	{
		int input[] = new int[4];
		input[0] = 01;
		input[1] = 17;
		input[2] = 04;
		input[3] = 27;

		int output[] = new int[input.length];

		for (int i = 0, j = input.length - 1; i < input.length; i++, j--)
		{
			output[j] = input[i];
		}

		System.out.println("Input Array is -> " + Arrays.toString(input));
		System.out.println("Output Array is -> " + Arrays.toString(output));
	}
}