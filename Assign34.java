package mkt.automation;

public class Assign34
{
	static void show()
	{
		int a = 10;   // local variable
		System.out.println("Static Method Value: " + a);
	}

	void display()
	{
		int b = 20;   // local variable
		System.out.println("Non Static Method Value: " + b);
	}

	public static void main(String[] args)
	{
		show();
		Assign34 A34 = new Assign34();
		A34.display();
	}
}