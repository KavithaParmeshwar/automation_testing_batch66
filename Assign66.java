/*Write a program to: Check if marks are valid (0–100)
Then assign grade: A, B, C, or Fail using nested if and scanner class*/

package mkt.automation;

import java.util.Scanner;

public class Assign66 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter marks: ");
		int marks = sc.nextInt();

		if (marks >= 0 && marks <= 100) 	// Check valid range
		{   
			if (marks >= 80) {
				System.out.println("Grade: A");
			} else if (marks >= 60) {
				System.out.println("Grade: B");
			} else if (marks >= 40) {
				System.out.println("Grade: C");
			} else {
				System.out.println("Result: Fail");
			}
		} else {
			System.out.println("Invalid marks");
		}

		sc.close();
	}
}