package mkt.automation;

import java.util.Scanner;

public class ScannerClassMar10_2
{

	public static void main(String[] args) 
	{
		//	Scanner s1=new Scanner();//it is calling the non parameterized cons of Scanner Class

		Scanner s1=new Scanner(System.in);//it is now calling the parameterized cons
		//of Scanner class
		
		System.out.println("Please enter the value of A:");
		int a=	s1.nextInt();
		System.out.println("Please enter the value of B:");
		int b=	s1.nextInt();

		int c=a*b;
		System.out.println("Answer:");
		System.out.println(c);

		s1.close();	
	}
}