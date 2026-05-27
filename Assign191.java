/*Assignment 191: Write a program using the put() method with Object, Object parameters in the Map Interface.*/

package mkt.automation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Assign191 
{
	public static void main(String[] args) 
	{
		Map<Object, Object> books = new HashMap<Object, Object>();
		books.put("The Alchemist", "Paulo Coelho");
		books.put("Harry Potter", "J.K. Rowling");
		books.put("The Hobbit", "J.R.R. Tolkien");
		books.put("Persuasion", "Jane Austen");
		books.put(104, "Pride and Prejudice-Jane Austen");
		books.put("A Brief History of Time", "Stephen Hawking");
		books.put("The Selfish Gene", "Richard Dawkins");

		System.out.println("Book Details: ");
		for (Map.Entry<Object, Object> output : books.entrySet()) {
			System.out.println(output.getKey() + " -> " + output.getValue());
		}
	}
}