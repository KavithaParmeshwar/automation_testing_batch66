/*Assignment 186: Write a program on sort method in collection class for integer values.*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assign186 
{
	public static void main(String[] args) 
	{
		List<Integer> input = new ArrayList<Integer>();
		input.add(01);
		input.add(04);
		input.add(27);
		input.add(17);
		input.add(03);
		input.add(07);

		System.out.println("Before Sorting - Insertion Order: " + input);

		Collections.sort(input);

		System.out.println("\nAfter Sorting - Ascending Order: " + input);
	}
}