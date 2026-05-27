/*Write a program to check whether a character is a vowel 
 or consonant must use if else block and scanner class*/

package mkt.automation;

import java.util.Scanner;

public class Assign52
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);

		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
				ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {

			System.out.println("Vowel");
		} else {
			System.out.println("Consonant");
		}

	}
}