/*Assignment 189: Write a Program with different functions of Map*/

package mkt.automation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Assign189 
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

		System.out.println("Index Of Books: " + books);

		System.out.println(books.get(2));
		System.out.println(books.containsKey(3));
		System.out.println(books.containsValue("Persuasion"));
		System.out.println(books.size());
		System.out.println(books.remove(04));
		System.out.println(books.isEmpty());
		
	}
}