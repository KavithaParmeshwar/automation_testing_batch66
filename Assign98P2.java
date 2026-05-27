/*Write a Program with all types of access specifier for global variable 
and try to access them with in the same class*/

package mkt.automation1;

public class Assign98P2
{
    public static void main(String[] args)
    {
    	Assign98 A98 = new Assign98();

        System.out.println("Public a: " + A98.a);      // ✅ Accessible
        // System.out.println("Private b: " + A98.b);  ❌ Not Accessible
        System.out.println("Protected c: " + A98.c);   // ✅ Accessible (same package)
        System.out.println("Default d: " + A98.d);     // ✅ Accessible (same package)
    }
}