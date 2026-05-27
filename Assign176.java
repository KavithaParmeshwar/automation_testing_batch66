/*Assignment 176: write a program on isempty method in the Collection class.*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Assign176 
{
    public static void main(String[] args)
    {

        Collection<String> books = new ArrayList<String>();
        
        System.out.println("Books Collection Status IsEmpty: " + books.isEmpty());
        
        books.add("The Alchemist");
        books.add("Harry Potter");
        books.add("The Hobbit");
        books.add("1984");
           
        
        System.out.println();
        System.out.println("Book Collection Current List: " + books);
    }
}