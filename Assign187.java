/*Assignment 187: Write a program on sort method in collection class for String values.*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assign187 
{
	public static void main(String[] args) 
	{
		List<String> books = new ArrayList<String>();
		books.add("\nThe Alchemist");
		books.add("\nHarry Potter");
		books.add("\nThe Hobbit");
		books.add("\nPersuasion");
		books.add("\nPride and Prejudice");
		books.add("\nA Brief History of Time");
		books.add("\nThe Selfish Gene");
		books.add("\nCosmos");

		System.out.println("Before Sorting - Insertion Order: " + books);

		Collections.sort(books);

		System.out.println("\nAfter Sorting - Alphabetical Order: " + books);
	}
}