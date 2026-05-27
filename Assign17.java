package mkt.automation;

public class Assign17
{
	// parameterized static method
	static void totalBill(int price, int quantity)
	{
		int total = price * quantity;
		System.out.println("Total Bill Amount: " + total);
	}

	public static void main(String[] args)
	{
		// calling static method from another class (assign16 is a static method, thus calling by name)
		Assign16.totalBill(200, 4);
	}
}