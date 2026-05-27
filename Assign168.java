/*Write a program to show isempty functions in ArrayList*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Arrays;

public class Assign168 
{
	public static void main(String[] args) 
	{
        ArrayList<String> input = new ArrayList<>();

        // Check if list is empty
        System.out.println("Is list empty? " + input.isEmpty());

        // Add elements
        input.add("A");
        input.add("B");

        // Check again
        System.out.println("After adding elements, is list empty? " + input.isEmpty());

        // Remove all elements
        input.clear();

        // Final check
        System.out.println("After clearing, is list empty? " + input.isEmpty());
    }
}