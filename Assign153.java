/*Write a program to check does the String contain Cart in it? "testing"*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign153
{
	public static void main(String[] args) 
	{
		String input = "testing";

		if (input.contains("Cart")) {
			System.out.println("Yes, the string contains 'Cart'");
		} else {
			System.out.println("No, the string does NOT contain 'Cart'");
		}
	}
}