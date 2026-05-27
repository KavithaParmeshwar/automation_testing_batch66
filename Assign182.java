/*Assignment 182: write a program on List Methods from add() to size() in the List Class*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Collection;

public class Assign182
{
	public static void main(String[] args)
	{

		Collection<String> books = new ArrayList<String>();  
		books.add("The Alchemist");
		books.add("Harry Potter");
		books.add("The Hobbit");
		books.add("1984");
		books.add("Persuasion");
		books.add("Pride and Prejudice");
		books.add("A Brief History of Time");
		books.add("The Selfish Gene");
		books.add("Cosmos");

		System.out.println("Book List: " + books);
		
		System.out.println(books.remove("1984"));
		System.out.println(books.contains("Persuasion"));
		System.out.println(books.size());
		System.out.println(books.isEmpty());
		System.out.println(books.remove("Cosmos"));
		
		System.out.println("Updated Book List: " + books);

	}
}