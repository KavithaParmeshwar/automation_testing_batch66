/*Write a program to calculate electricity bill: If units = 100 RS 5/unit
 If units > 100 RS10/unit must use scanner class to accept run time input*/

package mkt.automation;

import java.util.Scanner;

public class Assign60
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter units consumed: ");
		int units = sc.nextInt();

		int bill;

		if(units <= 100)
		{
			bill = units * 5;
		}
		else
		{
			bill = units * 10;
		}

		System.out.println("Electricity Bill: " + bill);
	}
}