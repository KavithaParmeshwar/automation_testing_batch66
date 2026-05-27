package mkt.automation;

public class Assign16
{
	// parameterized static method
	static void totalBill(int price, int quantity)
	{
		int total = price * quantity;
		System.out.println("Total Bill Amount: " + total);
	}

	public static void main(String[] args)
	{
		// calling static method using class name
		Assign16.totalBill(500, 3);
	}
}