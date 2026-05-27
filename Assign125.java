/*Write A Program on Multi Level Inheritance using Interface Concept*/

package mkt.automation;

interface Operation 
{
	void show();
}

class Parent2 implements Operation 
{
	int a = 10;

	public void show() 
	{
		System.out.println("Value of a: " + a);
	}
}

class Child2 extends Parent2 
{
	int b = 20;

	void display() 
	{
		System.out.println("Value of b: " + b);
	}
}

class GrandChild extends Child2 
{
	int c = 30;

	void print() 
	{
		System.out.println("Value of c: " + c);
	}
}

public class Assign125 
{
	public static void main(String[] args) 
	{
		GrandChild gc = new GrandChild();

		gc.show();     // From interface implemented in Parent
		gc.display();  // From Child class
		gc.print();    // From GrandChild class
	}
}