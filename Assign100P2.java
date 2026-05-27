/*Write a Program with all types of access specifier for global variable and try to access them 
 * outside the package without becoming the sub class*/

package mkt.automation1;

public class Assign100P2
{
    public static void main(String[] args)
    {
    	Assign100 A100 = new Assign100();

        System.out.println("Public a: " + A100.a);       // Accessible
        
        //System.out.println("Protected b: " + A100.b);    // NOT Accessible
        // System.out.println("Default c: " + A100.c);   // NOT Accessible
        // System.out.println("Private d: " + A100.d);   // NOT Accessible
    }
}