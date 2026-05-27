/*Write a program to Check whether two strings are anagrams using sort and equals in Java*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign162
{
	public static void main(String[] args) 
	{
		String st1 = "silent";
		String st2 = "listen";

		if (st1.length() != st2.length()) {
			System.out.println("They can never be anagram");
		} else {

			char[] ch1 = st1.toCharArray();
			char[] ch2 = st2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			System.out.println("Sorted first word: " + Arrays.toString(ch1));
			System.out.println("Sorted second word: " + Arrays.toString(ch2));

			if (Arrays.equals(ch1, ch2)) {
				System.out.println("\nYes, they are ANAGRAM");
			} else {
				System.out.println("\nNo, they are NOT ANAGRAM");
			}
		}
	}
}