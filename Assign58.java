/*Write a program to calculate grade based on marks: 
 90+ = A; 75-89 = B; 50-74=C: Below 50 = Fail must use if else and scanner class*/

package mkt.automation;

import java.util.Scanner;

public class Assign58
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter marks: ");
		int marks = sc.nextInt();

		if(marks >= 90)
		{
			System.out.println("Grade: A");
		}
		else if(marks >= 75)
		{
			System.out.println("Grade: B");
		}
		else if(marks >= 50)
		{
			System.out.println("Grade: C");
		}
		else
		{
			System.out.println("Grade: Fail");
		}
	}
}