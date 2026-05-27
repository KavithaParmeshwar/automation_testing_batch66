/*Assignment 171: WAP on collection concept with the help of Upcasting on 
 * Different Data types (Int, Char, Double, string etc.) with different methods like Add, Remove, Contains.*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Arrays;

public class Assign171 {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();

        // add() method
        list.add(10);          // int 
        list.add('A');         // char 
        list.add(25.5);        // double
        list.add("Hello");     // String

        System.out.println("After adding elements: " + list);

        // contains() method
        System.out.println("Contains 10 " + list.contains(10));
        System.out.println("Contains 'B' " + list.contains('B'));

        // remove() method
        list.remove(2); // removes element at index 2
        System.out.println("After removing element at index 2: " + list);

        list.remove("Hello"); // removes specific object
        System.out.println("After removing 'Hello': " + list);
    }
}