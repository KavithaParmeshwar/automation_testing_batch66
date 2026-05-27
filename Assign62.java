/*Write a program to launch different browsers using Scanner class in switch Concept*/

package mkt.automation;

import java.util.Scanner;

public class Assign62 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter browser name: ");
		String browser = sc.next();

		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("Launching Chrome Browser");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.out.println("Launching Firefox Browser");
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.out.println("Launching Edge Browser");
		}
		else
		{
			System.out.println("Invalid Browser");
		}

		sc.close();
	}
}