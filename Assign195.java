/*Assignment 195: Write a program using the putIfAbsent() method in the Map Interface.*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assign195 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> books = new HashMap<Integer, String>();
		books.putIfAbsent(01, "The Alchemist");
		books.putIfAbsent(02, "Harry Potter");
		books.putIfAbsent(03, "The Hobbit");
		books.putIfAbsent(04, "Persuasion");
		books.putIfAbsent(05, "Pride and Prejudice");
		books.putIfAbsent(06, "A Brief History of Time");
		books.putIfAbsent(07, "The Selfish Gene");

		books.putIfAbsent(07, "1984");		// this will not replace "The Selfish Gene"

		for (Map.Entry<Integer, String> output : books.entrySet())
		{
			System.out.println("Book: " + output.getKey() + " -> Author: " + output.getValue());
		}
	}
}