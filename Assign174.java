/*Assignment 174: write a program on add All method in the Collection class..*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Assign174 
{
    public static void main(String[] args)
    {

        // First collection (Book list 1)
        Collection<String> fictionBooks = new ArrayList<>();
        fictionBooks.add("The Alchemist");
        fictionBooks.add("Harry Potter");
        fictionBooks.add("The Hobbit");

        // Second collection (Book list 2)
        Collection<String> scienceBooks = new ArrayList<>();
        scienceBooks.add("A Brief History of Time");
        scienceBooks.add("The Selfish Gene");
        scienceBooks.add("Cosmos");

        System.out.println("Fiction Books: " + fictionBooks);
        System.out.println("Science Books: " + scienceBooks);

        fictionBooks.addAll(scienceBooks);

        System.out.println();
        System.out.println("List Of Fiction+Science Books: " + fictionBooks);
    }
}