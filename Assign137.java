/*Write a program to store student name along with their marks in double  and print them in readable format*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign137 
{
	public static void main(String[] args) 
	{
		String name[] = new String[5];
		name[0] = "Sona";
		name[1] = "Aniket";
		name[2] = "Aishwarya";
		name[3] = "Biswajit";
		name[4] = "Prerna";

		char initial[] = new char[5];
		initial[0] = 'S';
		initial[1] = 'A';
		initial[2] = 'A';
		initial[3] = 'B';
		initial[4] = 'P';

		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(initial));

		for (int i = 0; i < 5; i++)
		{
			System.out.println("My name is-> " + name[i] + " " + initial[i]);
		}
	}
}