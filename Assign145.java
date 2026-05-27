/*Write A Program to count the special charactaers present in the String*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign145 
{
	    static int countOfAlpha = 0;
	    static int countOfSpace = 0;
	    static int countOfNumeric = 0;
	    static int countOfSpecial = 0;

	    public static void main(String[] args) 
	    {

	        String input = "k v no 2 !@#";

	        char[] c1 = input.toCharArray();

	        for (int i = 0; i < input.length(); i++) 
	        {

	            boolean b1 = Character.isAlphabetic(c1[i]);
	            if (b1) {
	                countOfAlpha++;
	            }

	            boolean b2 = Character.isDigit(c1[i]);
	            if (b2) {
	                countOfNumeric++;
	            }

	            boolean b3 = Character.isWhitespace(c1[i]);
	            if (b3) {
	                countOfSpace++;
	            }
	        }

	        System.out.println("Total Count Of Alphabets -> " + countOfAlpha);
	        System.out.println("Total Count Of Numeric -> " + countOfNumeric);
	        System.out.println("Total Count Of Space -> " + countOfSpace);

	        countOfSpecial = input.length() - (countOfAlpha + countOfNumeric + countOfSpace);
	        System.out.println("Total Count Of Special -> " + countOfSpecial);
	    }
	}