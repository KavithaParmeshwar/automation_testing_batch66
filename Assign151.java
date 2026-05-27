/*Write a program to check weather auto present in the given string "automation"*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign151 
{
	public static void main(String[] args) 
	{
        String input = "automation";

        if (input.contains("auto")) {
            System.out.println("'auto' is present in the given string");
        } else {
            System.out.println("'auto' is NOT present in the given string");
        }
    }
}