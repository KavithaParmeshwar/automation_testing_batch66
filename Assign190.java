/*Assignment 190: Write a program using the put() method with String, String parameters in the Map Interface.*/

package mkt.automation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Assign190 
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

		System.out.println("Authors of the Books: ");
		System.out.println(books);
	}
}