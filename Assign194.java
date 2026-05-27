/*Assignment 194: Write a program using the putAll() method with Object, Object parameters in the Map Interface.*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assign194 
{
	public static void main(String[] args) 
	{
		Map<Object, Object> book1 = new HashMap<>();
		book1.put("The Alchemist", "Paulo Coelho");
		book1.put("Harry Potter", "J.K. Rowling");
		book1.put("The Hobbit", "J.R.R. Tolkien");

		Map<Object, Object> book2 = new HashMap<>();
		book2.put("Persuasion", "Jane Austen");
		book2.put("Pride and Prejudice", "Jane Austen");

		book1.putAll(book2);

		System.out.println("List of Books: " + book1);
		
		for (Map.Entry<Object, Object> output : book1.entrySet()) 
		{
			System.out.println("\nBook: " + output.getKey() + " -> Author: " + output.getValue());
		}
	}
}