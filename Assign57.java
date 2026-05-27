/*Write a program to check whether a number is 
between 10 and 50 using scanner class to accept run time input*/

package mkt.automation;

import java.util.Scanner;

public class Assign57
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		if(num >= 10 && num <= 50)
		{
			System.out.println("Number is between 10 and 50");
		}
		else
		{
			System.out.println("Number is NOT between 10 and 50");
		}
	}
}