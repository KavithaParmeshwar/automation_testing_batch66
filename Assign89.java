/*Write A Program on super calling statement using parameterized
super calling statement*/

package mkt.automation;

class CH89
{
	CH89(int a)
    {
        System.out.println("Constructor of parent class");
    }
}

public class Assign89 extends CH89
{
	Assign89()
    {
        super(100);
        System.out.println("Constructor of child class");
    }

    public static void main(String[] args) 
    {
        new Assign89();
    }
}