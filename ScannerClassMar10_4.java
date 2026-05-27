package mkt.automation;

import java.util.Scanner;

public class ScannerClassMar10_4
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.print("Enter First Integer Value:");
		int a=	s1.nextInt();
		
		System.out.print("Enter Second Byte Value:");
		byte b=	s1.nextByte();
		
		System.out.print("Enter Third Short Value:");
		short c=	s1.nextShort();
		
		System.out.print("Enter Fourth Long Value:");
		long d=	s1.nextLong();
		double e=	s1.nextDouble();
		float f=	s1.nextFloat();
		boolean g=	s1.nextBoolean();
		String h=	s1.next();
		s1.close();
	}
}