/*Write a program to check if 2 arrays are same or not*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign141 {

	public static void main(String[] args) {

		int[] input = new int[4];
		input[0] = 85;
		input[1] = 97;
		input[2] = 12;
		input[3] = 18;

		double sum = 0;
		double average = 0;

		for (int i = 0; i < input.length; i++) 
		{
			sum = sum + input[i];
		}

		System.out.println("Sum = " + sum);

		average = sum / input.length;

		System.out.println("Average = " + average);
	}
}