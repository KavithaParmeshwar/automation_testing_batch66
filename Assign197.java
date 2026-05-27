/*Assignment 197: Write a program on Iteration methods in the Map Interface using For Each Loop Concept.
1.keySet() 2.values() 3.entrySet().*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assign197 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> books = new HashMap<Integer, String>();
		books.put(01, "The Alchemist");
		books.put(02, "Harry Potter");
		books.put(03, "The Hobbit");
		books.put(04, "Persuasion");
		books.put(05, "Pride and Prejudice");
		books.put(06, "A Brief History of Time");
		books.put(07, "The Selfish Gene");

		System.out.println("Using keySet():");
		for (Integer key : books.keySet()) 
		{
			System.out.println("Key: " + key + " -> Value: " + books.get(key));
		}

		System.out.println();

		System.out.println("Using values():");
		for (String value : books.values()) 
		{
			System.out.println("Value: " + value);
		}

		System.out.println();

		System.out.println("Using entrySet():");
		for (Map.Entry<Integer, String> output : books.entrySet()) 
		{
			System.out.println("Key: " + output.getKey() + "  -> Value: " + output.getValue());
		}
	}
}