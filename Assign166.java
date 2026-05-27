/*Write a program to show all available add functions in ArrayList*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class Assign166 
{
    public static void main(String[] args) 
    {

        ArrayList<String> input = new ArrayList<>();

        input.add("A");
        input.add("B");
        System.out.println("After add(E e): " + input);		// add(E e)

        input.add(1, "X");
        System.out.println("After add(index, element): " + input);		//add(int index, E element)

        // 3. addAll(Collection c)
        ArrayList<String> input2 = new ArrayList<>(Arrays.asList("C", "D"));
        input.addAll(input2);
        System.out.println("After addAll(Collection): " + input);

        // 4. addAll(int index, Collection c)
        ArrayList<String> input3 = new ArrayList<>(Arrays.asList("Y", "Z"));
        input.addAll(2, input3);
        System.out.println("After addAll(index, Collection): " + input);

        // 5. addFirst(E e)  (Java 21+)
        input.addFirst("FIRST");
        System.out.println("After addFirst(): " + input);

        // 6. addLast(E e) (Java 21+)
        input.addLast("LAST");
        System.out.println("After addLast(): " + input);
    }
}