package mkt.automation;

import java.util.Arrays;

public class StringFunction0104_3 	// tocharArray
{
	public static void main(String[] args) 
	{
		String input = "Manish";		//[m,a,n,i,s,h] = Array

		char [] c1 = input.toCharArray();

		for (int i=0; i<input.length();i++)
		{
			System.out.println(c1[i]);
		}
		System.out.println(Arrays.toString(c1));
	}
}