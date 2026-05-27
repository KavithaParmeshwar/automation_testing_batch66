package mkt.automation;

import java.util.Scanner;

public class ScannerClassMar10_3
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of R");
		int r=	s1.nextInt();

		double area=Math.PI*r*r;;	//local but Pi is a global
		System.out.println(area);
		s1.close();
	}
}