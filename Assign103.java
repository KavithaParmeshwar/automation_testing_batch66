/*Write a Program with all types of access specifier for instance global variable 
 * and try to access them with in the same class*/

package mkt.automation;

public class  Assign103
{
    public static int a = 10;      // public
    protected static int b = 11;   // protected
    static int c = 12;             // default
    private static int d = 13;     // private

    public static void main() 
    {
        System.out.println("Inside same class:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}