/*Write a Program with all types of access specifier for non static methods 
 * and try to access them outside the class*/

package mkt.automation;

public class Assign111 
{
    private void privateMethod() 
    {
        System.out.println("Private Non-Static Method");
    }

    void defaultMethod() 
    {
        System.out.println("Default Non-Static Method");
    }

    protected void protectedMethod() 
    {
        System.out.println("Protected Non-Static Method");
    }

    public void publicMethod() 
    {
        System.out.println("Public Non-Static Method");
    }
}