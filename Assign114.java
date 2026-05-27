/*Write a Program with all types of access specifier for constructor and 
 * try to access them with in the same class inside package*/

package mkt.automation;

public class Assign114 
{

    // Public constructor
    public Assign114(int a) 
    {
        System.out.println("Public Constructor: " + a);
    }

    // Protected constructor
    protected Assign114(String msg) 
    {
        System.out.println("Protected Constructor: " + msg);
    }

    // Default constructor
    Assign114(double d) 
    {
        System.out.println("Default Constructor: " + d);
    }

    // Private constructor
    private Assign114() 
    {
        System.out.println("Private Constructor");
    }

    public static void main(String[] args) 
    {

        // Accessing all constructors within same class
        Assign114 obj1 = new Assign114(10);      // public
        Assign114 obj2 = new Assign114("Hello"); // protected
        Assign114 obj3 = new Assign114(5.5);     // default
        Assign114 obj4 = new Assign114();        // private
    }
}