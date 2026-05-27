/*Assignment 172: write a program on add method in the Collection class 
 * with Homogeneous Values.*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Assign172 {
    public static void main(String[] args) {

        Collection<Integer> list = new ArrayList<>();

        // add() method
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Elements in the collection: " + list);
    }
}