/*Write a program to Check Vowel or Consonant using scanner class in switch case concept*/

package mkt.automation;

import java.util.Scanner;

public class Assign64 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a character A to Z: ");
		char ch = sc.next().charAt(0);

		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("It is a Vowel");
			break;
		default:
			if(Character.isLetter(ch)) {
				System.out.println("It is a Consonant");
			} else {
				System.out.println("Invalid input! Please enter an alphabet.");
			}
		}
		sc.close();
	}
}