/*Write a Program to check person can vote only if he/she 
is 18 or above and should not vote if age is less using run time input*/

package mkt.automation;

import java.util.Scanner;

public class Assign51
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("You are not eligible to vote");
		}
		sc.close();
	}
}