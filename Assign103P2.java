/*Write a Program with all types of access specifier for instace global variable 
 * and try to access them outside the class however with in the package*/

package mkt.automation;

public class Assign103P2
{
    public static void main(String[] args)
    {
        System.out.println("Accessing from another class in same package:");

        // Accessible
        System.out.println(Assign103.a);  // public
        System.out.println(Assign103.b);  // protected
        System.out.println(Assign103.c);  // default

        // System.out.println(Asssign103.d); // ❌ compile-time error NOT accessible (private)

        Assign103.main();
    }
}