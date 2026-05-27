/*Write a Program to iterate each char present in a string*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign163
{
	public static void main(String[] args) 
	{
        String a = "EDUCATION";

        for (int i = 0; i < a.length(); i++)
        {
            System.out.println(a.charAt(i));
        }
    }
}