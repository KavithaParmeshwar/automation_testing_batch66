/*Assignment 192: Write a program to print name and gender using the put() method in the Map Interface.*/

package mkt.automation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assign192 
{
	public static void main(String[] args) 
	{
		Map<String, String> books = new HashMap<String, String>();
		books.put("The Alchemist", "Paulo Coelho");
		books.put("Harry Potter", "J.K. Rowling");
		books.put("The Hobbit", "J.R.R. Tolkien");
		books.put("Persuasion", "Jane Austen");
		books.put("Pride and Prejudice", "Jane Austen");
		books.put("A Brief History of Time", "Stephen Hawking");
		books.put("The Selfish Gene", "Richard Dawkins");

		System.out.println("Book Details: ");
		for (Entry<String, String> output : books.entrySet()) {
			System.out.println(output.getKey() + " -> " + output.getValue());
		}
	}
}