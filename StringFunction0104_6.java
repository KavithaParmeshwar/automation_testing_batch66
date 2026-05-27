package mkt.automation;

import java.util.Arrays;

public class StringFunction0104_6
{
	public static void main(String[] args)
	{
		// char array
		char[] grade = new char[5];
		grade[0] = 'A';
		grade[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'A';
		grade[4] = 'B';
		System.out.println(Arrays.toString(grade));

		// boolean array
		boolean[] result = new boolean[5];
		result[0] = true;
		result[1] = false;
		result[2] = true;
		result[3] = true;
		result[4] = false;
		System.out.println(Arrays.toString(result));

		// double array
		double[] marks = new double[5];
		marks[0] = 85.5;
		marks[1] = 90.0;
		marks[2] = 76.25;
		marks[3] = 88.75;
		marks[4] = 92.5;
		System.out.println(Arrays.toString(marks));

		
		for (int i = 0; i < 5; i++)	// Loop to print all values together
		{
			System.out.println("Grade -> " + grade[i] +
					" | Result -> " + result[i] +
					" | Marks -> " + marks[i]);
		}
	}
}