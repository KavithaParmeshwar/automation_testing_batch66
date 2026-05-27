/*Write A Program on method overriding*/

package mkt.automation;

class Payment5 
{
	void pay() 
	{
		System.out.println("Making a general payment");
	}
}

class UPI extends Payment5 
{

	void pay() 
	{
		System.out.println("Payment made using UPI");
	}
}

public class Assign118 
{
	public static void main(String[] args) 
	{
		UPI upi = new UPI();

		upi.pay(); // Calls overridden method
	}
}