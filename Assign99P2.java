/*Write a Program with all types of access specifier for global variable and try to access 
 * them outside the package by becoming the sub class*/

package mkt.automation1;

public class Assign99P2 extends Assign99
{
    public static void main(String[] args)
    {
    	Assign99P2 A99P2 = new Assign99P2();

        System.out.println("Public a: " + A99P2.a);       // ✅ Accessible
        System.out.println("Protected b: " + A99P2.b);    // ✅ Accessible (via subclass)

        // System.out.println("Default c: " + obj.c);   ❌ NOT Accessible
        // System.out.println("Private d: " + obj.d);   ❌ NOT Accessible
    }
}