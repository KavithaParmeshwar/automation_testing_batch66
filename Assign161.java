/*Write a program using different methods in string buffer*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign161
{
	public static void main(String[] args) 
	{
        StringBuffer st1 = new StringBuffer("Manual Testing");

        // insert method
        System.out.println("Insert -> " + st1.insert(7, "API "));

        // replace method
        System.out.println("Replace -> " + st1.replace(0, 6, "Automation"));

        // delete method
        System.out.println("Delete -> " + st1.delete(0, 6));

        // substring methods (do not modify StringBuffer)
        System.out.println("Substring from index 7 -> " + st1.substring(7));
       
        System.out.println("Substring (7,9) -> " + st1.substring(7, 9));
    }
}