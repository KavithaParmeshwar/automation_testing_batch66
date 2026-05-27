/*Write a program using nested if and scanner class 
a. Check if marks are valid (0–100)
b. marks above 90 then check math and science should above 90 then A+ 
c. marks above 90 then check if math and science below 90 then A
d. marks above 80 and below 90 then check math and science should above 90 then B+
e. marks above 80 and below 90 then check if math and science below 90 then B*/

package mkt.automation;

import java.util.Scanner;

public class Assign70 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter total marks:");
		int marks = sc.nextInt();

		if(marks >= 0 && marks <= 100)
		{
			System.out.println("Enter Math marks:");
			int math = sc.nextInt();

			System.out.println("Enter Science marks:");
			int science = sc.nextInt();

			if(marks > 90)
			{
				if(math > 90 && science > 90)
				{
					System.out.println("Grade: A+");
				}
				else
				{
					System.out.println("Grade: A");
				}
			}
			else if(marks > 80 && marks <= 90)
			{
				if(math > 90 && science > 90)
				{
					System.out.println("Grade: B+");
				}
				else
				{
					System.out.println("Grade: B");
				}
			}
			else
			{
				System.out.println("Grade not defined for below 80");
			}
		}
		else
		{
			System.out.println("Invalid Marks! Enter between 0 to 100");
		}
	}
}