package mkt.automation;

public class Assign20 
{
	static void add()
	{
		System.out.println("without parameters");
	}
	static void add(int a)
	{
		System.out.println("with one parameter");
	}
	static void add(int a, int j)
	{
		System.out.println("with two parameter");
	}

	public static void main(String[] args) {
		add();
		add(10);
		add(10,20);
	}
}