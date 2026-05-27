/*Assignment 199: Write a program on Get() method in the Map Interface.*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assign199 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> books = new HashMap<Integer, String>();
		books.put(01, "The Alchemist");
		books.put(02, "Harry Potter");
		books.put(03, "The Hobbit");
		books.put(04, "Persuasion");
		books.put(05, "Pride and Prejudice");

		String value1 = books.get(2);
		String value2 = books.get(4);
		String value3 = books.get(5);

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}