/*Assignment 169: Write a program to demonstrate the following functions like 
 * append, insert, replace, delete, reverse, capacity, charAt, length, substring(int) 
 * & substring (start & end index) using StringBuffer concept*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Arrays;

public class Assign169 
{
    public static void main(String[] args) 
    {

        // Create StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        // append()
        sb.append(" World");
        System.out.println("After append: " + sb);

        // insert()
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // replace()
        sb.replace(6, 10, "C++");
        System.out.println("After replace: " + sb);

        // delete()
        sb.delete(5, 9);
        System.out.println("After delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // capacity()
        System.out.println("Capacity: " + sb.capacity());

        // charAt()
        System.out.println("Character at index 2: " + sb.charAt(2));

        // length()
        System.out.println("Length: " + sb.length());

        // substring(int start)
        String sub1 = sb.substring(2);
        System.out.println("Substring from index 2: " + sub1);

        // substring(int start, int end)
        String sub2 = sb.substring(1, 5);
        System.out.println("Substring from index 1 to 5: " + sub2);
    }
}