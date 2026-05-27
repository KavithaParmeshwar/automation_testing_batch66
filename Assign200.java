/*Assignment 200: Write a program on Contains() method both Key and Values in the Map Interface.*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assign200 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> books = new HashMap<Integer, String>();
		books.put(01, "The Alchemist");
		books.put(02, "Harry Potter");
		books.put(03, "The Hobbit");
		books.put(04, "Persuasion");
		books.put(05, "Pride and Prejudice");

		System.out.println("List of Books: " + books);

		System.out.println(books.containsKey(2));
		System.out.println(books.containsKey(6));

		System.out.println(books.containsValue("Persuasion"));
	}
}