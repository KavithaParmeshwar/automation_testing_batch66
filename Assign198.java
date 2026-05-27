/*Assignment 198: Write a program on Remove() method with Key and Both Key ,Value parameters in the Map Interface.*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assign198 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> books = new HashMap<Integer, String>();
		books.put(01, "The Alchemist");
		books.put(02, "Harry Potter");
		books.put(03, "The Hobbit");
		books.put(04, "Persuasion");
		books.put(05, "Pride and Prejudice");

		System.out.println("Book Of List: "+ books);

		System.out.println("Remove the Book: " + books.remove(03));
		System.out.println("Remove the Book: " + books.remove(02, "Harry Potter"));

		System.out.println("Updated List Of Books: " + books);
	}
}