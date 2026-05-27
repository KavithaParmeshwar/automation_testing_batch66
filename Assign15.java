package mkt.automation;

public class Assign15 
{

	//non-static non parameterized method 1
	void cashDeposit()
	{
		System.out.println("Money deposited successfully");
	}

	//non-static non parameterized method 2
	void cashWithdraw()
	{
		System.out.println("Money withdrawn successfully");
	}

	//non-static non parameterized method 3
	void checkBalance()
	{
		System.out.println("Checking account balance");
	}

	public static void main(String[] args)
	{

		// single reference variable
		Assign15 ATM = new Assign15();
		ATM.cashDeposit();
		ATM.cashWithdraw();
		ATM.checkBalance();
	}
}
