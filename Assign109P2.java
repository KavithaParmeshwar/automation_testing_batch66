/*Write a Program with all types of access specifier for static methods and 
 * try to access them outside the package without becoming the sub class*/

package mkt.automation1;

import mkt.automation.Assign109;

public class Assign109P2 
{

    public static void main(String[] args) 
    {

        //  privateMethod();  Not accessible
        //  defaultMethod();  Not accessible (different package)
        //  protectedMethod();  Not accessible (no subclass relationship)
    	
        //  Only public method is accessible
        Assign109.publicMethod();
    }
}