/*Write a program with different string builder functions*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign165
{
	public static void main(String[] args) 
	{
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Original String: " + sb);

        // 1. append() - adds text at the end
        sb.append(" World");
        System.out.println("After append(): " + sb);

        // 2. insert() - inserts text at a specific position
        sb.insert(5, " Java");
        System.out.println("After insert(): " + sb);

        // 3. replace() - replaces a portion of string
        sb.replace(6, 10, "C++");
        System.out.println("After replace(): " + sb);

        // 4. delete() - deletes a portion of string
        sb.delete(6, 9);
        System.out.println("After delete(): " + sb);

        // 5. reverse() - reverses the string
        sb.reverse();
        System.out.println("After reverse(): " + sb);

        // Reverse back to original order for further demo
        sb.reverse();

        // 6. capacity() - shows current capacity
        System.out.println("Capacity: " + sb.capacity());

        // 7. length() - shows length of string
        System.out.println("Length: " + sb.length());

        // 8. charAt() - character at index
        System.out.println("Character at index 1: " + sb.charAt(1));

        // 9. setCharAt() - changes character at index
        sb.setCharAt(0, 'Y');
        System.out.println("After setCharAt(): " + sb);

        // 10. ensureCapacity() - increases capacity if needed
        sb.ensureCapacity(50);
        System.out.println("New Capacity after ensureCapacity(50): " + sb.capacity());
    }
}