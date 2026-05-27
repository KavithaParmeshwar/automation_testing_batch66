/*Write a program using nested if, If salary > 50,000 ? check years of experience
If experience > 5 ? give bonus Else ? no bonus use scanner class to accept run time input*/

package mkt.automation;

import java.util.Scanner;

public class Assign67 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();

		if (salary > 50000) {   // First condition
			System.out.print("Enter years of experience: ");
			int exp = sc.nextInt();

			if (exp > 5) {   // Nested condition
				System.out.println("Bonus given");
			} else {
				System.out.println("No bonus");
			}
		} else {
			System.out.println("No bonus");
		}

		sc.close();
	}
}