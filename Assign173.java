/*Assignment 173: Write a Program on add method in the collection class with hetrogeneous Values.*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Assign173 
{
    public static void main(String[] args) 
    {
        Collection<Object> list = new ArrayList<>();

        // add() method with different data types
        list.add(10);          // Integer
        list.add('A');         // Character
        list.add(25.5);        // Double
        list.add("Hello");     // String
        list.add(true);        // Boolean

        System.out.println("Heterogeneous Collection Elements: " + list);
    }
}