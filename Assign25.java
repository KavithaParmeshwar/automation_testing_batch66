package mkt.automation;

public class Assign25
{
    // constructor - non parameterized
	Assign25()
    {
        System.out.println("Constructor Method Called");
    }

    // static method
    static void display()
    {
        System.out.println("Static Method Called");
    }

    // non static method
    void show()
    {
        System.out.println("Non-static Method Called");
    }

    public static void main(String[] args)
    {
        display();

        // syntax of creating an object of the constructor, were it will be called automatically
        Assign25 A25 = new Assign25();

        // calling non static method
      	
      	A25.show();
    }
}