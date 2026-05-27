/*Write a Java program where Vehicle is extended by Car and Bike to display 
 * different features - Hierarchical Inheritance*/

package mkt.automation;

class Vehicle 
{
	void show() 
	{
		System.out.println("This is a Hybrid Vehicle");
	}
}

class Car extends Vehicle 
{
	void carFeatures() 
	{
		System.out.println("Car Features:");
		System.out.println("Runs On NPL & Fuel");
		System.out.println("Provides safety and comfort");
		System.out.println("Has AC and more space");
	}
}

class Bike extends Vehicle 
{
	void bikeFeatures() 
	{
		System.out.println("Bike Features:");
		System.out.println("Fuel efficient");
		System.out.println("Easy in traffic");
		System.out.println("Easy to park");
	}
}

public class Assign82 
{
	public static void main(String[] args) 
	{

		Car c = new Car();
		c.show();
		c.carFeatures();

		System.out.println();

		Bike b = new Bike();
		b.show();
		b.bikeFeatures();
	}
}