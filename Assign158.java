/*Write a program where Input is "Manish Kumar Tiwari " Output "MKT"*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign158
{
	public static void main(String[] args) 
	{
        String input = "Manish Kumar Tiwari";

        String[] st1 = input.split(" ");

        String output = "";
        for (int i = 0; i < st1.length; i++) 	//runs thrice against split words
        {
            output = output + st1[i].charAt(0);		//charAt(0) picks the first letter of each split words
        }

        System.out.println(output); // MKT
    }
}