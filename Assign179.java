/*Assignment 179: write a program on Remove method in the Collection class.*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Assign179
{
	public static void main(String[] args)
	{

		Collection<String> books = new ArrayList<String>();  
		books.add("The Alchemist");
		books.add("Harry Potter");
		books.add("The Hobbit");
		books.add("1984");

		Collection<String> book1 = new ArrayList<String>();
		book1.add("Persuasion");
		book1.add("Pride and Prejudice");

		Collection<String> book2 = new ArrayList<String>();
		book2.add("A Brief History of Time");
		book2.add("The Selfish Gene");
		book2.add("Cosmos");

		System.out.println("Book List: " + books);
		System.out.println("Book List: " + book1);
		System.out.println("Book List: " + book2);

		books.remove("1984");
		book1.remove("Cosmos");
		book2.remove("Cosmos");
		
		System.out.println();
		System.out.println("Updated Book List: " + books);
		System.out.println("Updated Book List: " + book1);
		System.out.println("Updated Book List: " + book2);
	}
}