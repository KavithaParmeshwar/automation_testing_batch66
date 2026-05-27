package mkt.automation;

public class Assign33
{	
	static int a=100;	//Global variable
	static int b=10;	//Global variable
	static void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	static void sub()
	{
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
	}
}
