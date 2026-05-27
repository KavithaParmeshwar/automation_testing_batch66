/*Write a program using different append method in string buffer*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign160
{
	public static void main(String[] args) 
	{
        StringBuffer sb = new StringBuffer();

        // append String
        sb.append("Automation");

        // append String
        sb.append(" Testing");

        // append char
        sb.append(' ');

        // append int
        sb.append(123);

        sb.append(' ');

        // append boolean
        sb.append(true);

        sb.append(' ');

        // append double
        sb.append(99.99);

        System.out.println(sb);
    }
}