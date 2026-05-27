/*Write a program using nested if and scanner class
a. female having aadhar card - free travel 
b. female no aadhar card - full price 
c. male - ful price 
d. male - senior citizen - 50% price 
e. kids below 5 years free 
f. kids between 5 to 10 years 10% price*/

package mkt.automation;

import java.util.Scanner;

public class Assign69 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter age:");
		int age = sc.nextInt();

		if(age < 5)
		{
			System.out.println("Kids below 5 - Free Travel");
		}
		else if(age >= 5 && age <= 10)
		{
			System.out.println("Kids 5 to 10 -10% Price");
		}
		else
		{
			System.out.println("Enter gender: ");
			String gender = sc.next();

			if(gender.equalsIgnoreCase("female"))
			{
				System.out.println("Do you have Aadhar card? (yes/no):");
				String aadhar = sc.next();

				if(aadhar.equalsIgnoreCase("yes"))
				{
					System.out.println("Free Travel for Female with Aadhar");
				}
				else
				{
					System.out.println("Full Price for Female without Aadhar");
				}
			}
			else if(gender.equalsIgnoreCase("male"))
			{
				if(age >= 60)
				{
					System.out.println("Senior Citizen Male - 50% Price");
				}
				else
				{
					System.out.println("Male - Full Price");
				}
			}
		}
	}
}