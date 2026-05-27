package mkt.automation;

import java.util.Scanner;

public class SessionPractice 
{
	public static void main(String[] args) 
	{
		Scanner	sc = new Scanner(System.in);
		
		System.out.println("Please Enter Your Name");
		String name = sc.nextLine();
		
		System.out.println("Please Enter Your Balance");
		double balance = sc.nextDouble();
		
		StringBuilder input = new StringBuilder();
		
		input.append("Welcome ");
		input.append(name);
		input.append("! Your Current Balance is ");
		input.append(balance);
		input.append("Thank You.. For Banking With Us");
		
		System.out.println(input);
		
		sc.close();
	}
}
