/*Write a program to split the given string "Automation Testing"*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign152 
{
	public static void main(String[] args) 
	{
		String input = "Automation Testing";

		String [] output = input.split(" ");

		System.out.println(Arrays.toString(output));
	}
}