/*Write a program to check whether a person is 
 eligible for a senior citizen discount by accepting run time input(age = 60).*/

package mkt.automation;

import java.util.Scanner;

public class Assign54
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		if(age >= 60)
		{
			System.out.println("Eligible for senior citizen discount");
		}
		else
		{
			System.out.println("Not eligible for senior citizen discount");
		}
	}
}