/*Assignment 188: Write a Program to iterate a Map*/

package mkt.automation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Assign188 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> books = new HashMap<Integer,String>();
		books.put(01, "The Alchemist");
		books.put(02, "Harry Potter");
		books.put(03, "The Hobbit");
		books.put(04, "Persuasion");
		books.put(05, "Pride and Prejudice");
		books.put(06, "A Brief History of Time");
		books.put(07, "The Selfish Gene");

		System.out.println("Index Of Book: " + books);

		for (Integer key : books.keySet())
		{
			System.out.println("\nIndex Number: " + key);
			System.out.println("Book Name: " + books.get(key));
		}
	}
}