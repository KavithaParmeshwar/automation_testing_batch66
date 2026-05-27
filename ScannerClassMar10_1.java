package mkt.automation;

import java.util.Scanner;

public class ScannerClassMar10_1
{

	public static void main(String[] args) 
	{
		//	Scanner s1=new Scanner(non parameter);	//it is calling the non parameterized constructor of Scanner Class
		//	Scanner s1=new Scanner(System.in);	//it is calling the parameterized constructor of Scanner Class

		Scanner s1=new Scanner(System.in);	//it is now calling the parameterized constructor of Scanner class

		int a=	s1.nextInt();
		int b=	s1.nextInt();

		int c=a*b;
		
		System.out.println(c);
		
		s1.close();
	}

}
