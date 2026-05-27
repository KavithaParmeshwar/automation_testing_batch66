/*Write a program using nested if Check username 
If correct, then check password Print login success or failure*/

package mkt.automation;

import java.util.Scanner;

public class Assign68 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Username: ");
		String username = sc.next();

		System.out.println("Enter Password: ");
		String password = sc.next();

		// Nested if condition
		if(username.equalsIgnoreCase("admin"))
		{
			if(password.equals("1234"))
			{
				System.out.println("Login Successful");
			}
			else
			{
				System.out.println("Incorrect Password");
			}
		}
		else
		{
			System.out.println("Invalid Username");
		}

		sc.close();
	}
}