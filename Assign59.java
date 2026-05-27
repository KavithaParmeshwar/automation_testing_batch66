/*Write a program to find the largest of two numbers using scanner class*/

package mkt.automation;

import java.util.Scanner;

public class Assign59
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = sc.nextInt();

		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		if(a > b)
		{
			System.out.println("Largest number is: " + a);
		}
		else
		{
			System.out.println("Largest number is: " + b);
		}
	}
}