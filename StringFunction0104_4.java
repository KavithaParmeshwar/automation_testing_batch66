package mkt.automation;

import java.util.Arrays;

public class StringFunction0104_4 	// tocharArray
{
	public static void main(String[] args) 
	{
		String input="Bengaluru";

		char [] output=input.toCharArray();

		for (int i=0; i<input.length(); i++)

		{
			System.out.println(output[i]);
		}
		System.out.println(Arrays.toString(output));
	}
}