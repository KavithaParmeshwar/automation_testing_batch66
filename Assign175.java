/*Assignment 175: Write a Program on Clear method in the collection class.*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Assign175 
{
    public static void main(String[] args)
    {

        Collection<String> books = new ArrayList<String>();
        books.add("The Alchemist");
        books.add("Harry Potter");
        books.add("The Hobbit");
        books.add("1984");
        
        System.out.println("Book Collection: " + books);
        
        books.clear();
        
        System.out.println();
        System.out.println("Book Collection: " + books);
    }
}