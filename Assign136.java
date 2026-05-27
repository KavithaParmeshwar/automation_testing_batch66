/*Write a program to store student name along with their marks in double  and print them in readable format*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign136 
{
	public static void main(String[] args) 
	{
		String name[] = new String[5];
		name[0] = "Sona";
		name[1] = "Aniket";
		name[2] = "Aishwarya";
		name[3] = "Biswajit";
		name[4] = "Prerna";

		double marks[] = new double[5];
		marks[0] = 85.5;
		marks[1] = 78.0;
		marks[2] = 92.3;
		marks[3] = 66.5;
		marks[4] = 88.0;

		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(marks));

		for (int i = 0; i < 5; i++)
		{
			System.out.println("My name is-> " + name[i] + " & My Marks are-> " + marks[i]);
		}
	}
}