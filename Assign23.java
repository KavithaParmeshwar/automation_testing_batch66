package mkt.automation;

public class Assign23

{
	// Static parameterized method
	static void bill(double price)
	{
		System.out.println("Price of item: " + price);
	}

	// Non-static parameterized method
	void bill(double price, int quantity)
	{
		double total = price * quantity;
	}

	// Non-static parameterized method
	void bill(double price, int quantity, double gstPercent)
	{
		double total = (price * quantity);
		double gst = (total * gstPercent) / 100;
		double finalBill = total + gst;

		System.out.println("Total Bill: " + total);
		System.out.println("GST (18%): " + gst);
		System.out.println("Final Bill Amount: " + finalBill);
	}

	public static void main(String[] args)
	{
		// Calling static method
		Assign23.bill(200);

		// Object creation
		Assign23 restaurant = new Assign23();

		restaurant.bill(200, 3);
		restaurant.bill(200, 3, 18);
	}
}