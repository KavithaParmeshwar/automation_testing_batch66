/*Write a program using concat method*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign155
{
	public static void main(String[] args) 
	{
		String input = "knowledge is wealth";

		String st1 = "Knowledge";
		String st2 = " is";
		String st3 = " Power";

		String result = st1.concat(st2).concat(st3);

		System.out.println("First String: " + st1);
		System.out.println("Second String: " + st2);
		System.out.println("Third String: " + st3);
		System.out.println("");
		System.out.println("After Concat: " + result);
	}
}