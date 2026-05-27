/*Write a program to check whether a number is 
 even or odd using run time input and if else block*/

package mkt.automation;

import java.util.Scanner;

public class Assign50
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer to check if it is odd or even");
		int x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("You entered an even number.");
		} else {
			System.out.println("You entered an odd number.");
		}
		sc.close();
	}
}