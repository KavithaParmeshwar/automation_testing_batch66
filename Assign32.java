package mkt.automation;

import java.util.Scanner;

public class Assign32
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter side of square:");
		double side = sc.nextDouble();
		System.out.println("Square Area = " + (side*side));
		System.out.println("Square Perimeter = " + (4*side));

		System.out.println("Enter length and breadth of rectangle:");
		double length = sc.nextDouble();
		double breath = sc.nextDouble();
		System.out.println("Rectangle Area = " + (length*breath));
		System.out.println("Rectangle Perimeter = " + (2*(length*breath)));

		System.out.println("Enter radius of circle:");
		double radius = sc.nextDouble();
		System.out.println("Circle Area = " + (Math.PI*radius*radius));
		System.out.println("Circle Circumference = " + (2*Math.PI*radius));

		System.out.println("Enter base and height of triangle:");
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		System.out.println("Triangle Area = " + (0.5*base*height));

		sc.close();
	}
}