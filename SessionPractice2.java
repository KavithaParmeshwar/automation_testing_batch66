package mkt.automation;

import java.util.Scanner;

public class SessionPractice2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		double balance = 0.0;

		System.out.println("Please Enter Your Name: ");
		String userName = sc.nextLine();

		while (true)
		{
			System.out.println("     MENU     ");
			System.out.println("1: Cash Deposit");
			System.out.println("2: Cash Withdrawal");
			System.out.println("3: Balance Enquiry");
			System.out.println("4: Exit");

			System.out.println("Please Enter Your Choice");
			int choice = sc.nextInt();

			if (choice == 1)
			{
				System.out.println("Enter The Deposit Amount");
				double deposit = sc.nextDouble();
				balance = balance + deposit;

				System.out.println("Amount Deposited Successfully");
				System.out.println("Current Balance: " + balance);
			}
			else if (choice == 2)
			{
				System.out.println("Enter The Withdrawal Amount");
				double withDrawal = sc.nextDouble();

				if (withDrawal > balance)
				{
					System.out.println("Insufficient Balance");
				}
				else 
				{
					balance = balance - withDrawal;
					System.out.println("Amount Withdrawal Successful");
					System.out.println("Current Balance: " + balance);
				}
			}
			else if (choice == 3) 
			{
				System.out.println("Your balance is: " + balance);
			} 
			else if (choice == 4) 
			{
				StringBuilder sb = new StringBuilder();
				sb.append("Thank you ");
				sb.append(userName);
				sb.append(" for banking with us!");

				System.out.println(sb.toString());
				break;
			}
			else
			{
				System.out.println("Invalid choice! Please select 1 to 4.");
			}

		}
		sc.close();
	}
}