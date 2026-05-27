/*Assignment 184: Write a difference between 3 types of cursor 1.Enumeration 2.Iterator 3.ListIterator*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assign184 
{
	public static void main(String[] args) 
	{
		List<String> books = new ArrayList<>();
		books.add("The Alchemist");
		books.add("Harry Potter");
		books.add("The Hobbit");
		books.add("1984");

		System.out.println("Actual List: " + books);

		System.out.println();
		System.out.println("Iterator - Forward Traversal:");
		Iterator<String> output = books.iterator();
		while (output.hasNext()) 
		{
			System.out.println(output.next());
		}

		System.out.println();
		System.out.println("ListIterator - Forward Traversal:");
		ListIterator<String> output1 = books.listIterator();
		while (output1.hasNext()) 
		{
			System.out.println(output1.next());
		}

		System.out.println();
		System.out.println("ListIterator - Backward Traversal:");
		while (output1.hasPrevious()) 
		{
			System.out.println(output1.previous());
		}
	}
}