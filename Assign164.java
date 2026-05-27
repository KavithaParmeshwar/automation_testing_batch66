/*Write a program with different string buffer functions */

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign164
{
	public static void main(String[] args) 
	{
        StringBuffer sb = new StringBuffer("Hello");

        // append()
        sb.append(" World");
        System.out.println("After append: " + sb);

        // insert()
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // replace()
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // delete()
        sb.delete(2, 7);
        System.out.println("After delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // reverse back for further operations
        sb.reverse();

        // substring()
        System.out.println("Substring (from index 2): " + sb.substring(2));
        System.out.println("Substring (2 to 5): " + sb.substring(2, 5));

        // length()
        System.out.println("Length: " + sb.length());

        // capacity()
        System.out.println("Capacity: " + sb.capacity());
    }
}