/*Write a program to showcase all the replace string function*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign154
{
	public static void main(String[] args) 
	{
        String input = "knowledge is wealth";

        System.out.println("Original String: " + input);

        // replace()	replace word
        String st1 = input.replace("knowledge", "learning");
        System.out.println("replace(): " + st1);

        // replaceFirst()	replaces only first match
        String st2 = input.replaceFirst("i", "@");
        System.out.println("replaceFirst(): " + st2);

        // replaceAll()		regex based replacement
        String st3 = input.replaceAll("e", "#");
        System.out.println("replaceAll(): " + st3);

        // replace character
        String st4 = input.replace('a', '*');
        System.out.println("Character replace(): " + st4);
    }
}