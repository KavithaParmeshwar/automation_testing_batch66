/*Write A Program to avoid Method Overiding using Final Method*/

package mkt.automation;

class Bank 
{
	final void interestRate() 
	{
		System.out.println("Bank interest rate is fixed at 5%");
	}
}

class SBI extends Bank 
{

	void display() 
	{
		System.out.println("Welcome to SBI Bank");
	}
}

public class Assign121 
{
	public static void main(String[] args) 
	{
		SBI sbi = new SBI();

		sbi.interestRate(); // Calling final method
		sbi.display();
	}
}