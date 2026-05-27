/*Write a program to calculate simple interest and check 
if it is greater than 1000 must use math class and scanner class*/

package mkt.automation;

import java.util.Scanner;

public class Assign53
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Principal amount: ");
		double p = sc.nextDouble();

		System.out.print("Enter Rate of interest: ");
		double r = sc.nextDouble();

		System.out.print("Enter Time (in years): ");
		double t = sc.nextDouble();

		// Simple Interest formula: (P * R * T) / 100
		double si = (p * r * t) / 100;

		si = Math.round(si);   // rounding the value using Math class

		System.out.println("Simple Interest = " + si);

		if (si > 1000) {
			System.out.println("Simple Interest is greater than 1000");
		} else {
			System.out.println("Simple Interest is not greater than 1000");
		}

		sc.close();
	}
}