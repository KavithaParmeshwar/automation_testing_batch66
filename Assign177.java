/*Assignment 177: write a program on Contains method in the Collection class.*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Assign177 
{
    public static void main(String[] args)
    {

        Collection<String> books = new ArrayList<String>();
                
        books.add("The Alchemist");
        books.add("Harry Potter");
        books.add("The Hobbit");
        books.add("1984");
           
        System.out.println("Book Collection Current List: " + books);
        
        System.out.println();
        System.out.println("Contains The Hobbit: " + books.contains("The Hobbit"));
        System.out.println("Contains 1984: " + books.contains("1984"));
        System.out.println("Contains Potter: " + books.contains("Potter"));
    }
}