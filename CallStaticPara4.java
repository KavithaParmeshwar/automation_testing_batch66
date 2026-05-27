package mkt.automation;

public class CallStaticPara4 
{
	public static void main(String[] args) 
	{
		System.out.println("Automation Testing");
		sum(10, 20);
		difference(50, 30);
	}
	static void sum(int a, int b)
	{
		int sum = a + b;
		System.out.println(sum);
	}
	static void difference(int c, int d)
	{
		int difference = c - d;
		System.out.println(difference);
	}
}
