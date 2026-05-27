/*Write A Program on Abstract Class and Abstract Method*/

package mkt.automation;

abstract class Payment 
{

	abstract void makePayment();
}

class CreditCard extends Payment 
{

	void makePayment() 
	{
		System.out.println("Payment made using Credit Card");
	}
}

public class Assign122 
{
	public static void main(String[] args) 
	{
		CreditCard cc = new CreditCard();

		cc.makePayment(); // Calling abstract method
	}
}