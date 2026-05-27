/*Write a Program on Switch Concept*/

package mkt.automation;

import java.util.Scanner;

public class Assign61
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number (1-3): ");
		int num = sc.nextInt();

		switch(num)
		{
		case 1:
			System.out.println("You selected One");
			break;

		case 2:
			System.out.println("You selected Two");
			break;

		case 3:
			System.out.println("You selected Three");
			break;

		default:
			System.out.println("Invalid Choice");
		}
	}
}