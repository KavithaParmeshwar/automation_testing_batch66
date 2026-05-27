/*Write a program where Input is""Manish Kumar tiwari" Output "
 M
 K
 T"*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign159
{
	public static void main(String[] args) 
	{
        String input = "Manish Kumar Tiwari";

        String[] output = input.split(" ");

        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i].charAt(0));
        }
    }
}