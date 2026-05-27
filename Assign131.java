/*Write A Program to check if the given string is a Palindrome?*/

package mkt.automation;

public class Assign131 
{
	public static void main(String[] args) 
	{
		{
			String input = "madam";
			String output = ""; // reverse of madam

			for(int i = input.length() - 1; i >= 0; i--)
			{
				char c1 = input.charAt(i);
				output = output + c1;
			}

			System.out.println("My Input is-> " + input);
			System.out.println("My Output is-> " + output);

			if(input.equals(output))
			{
				System.out.println("It is a Palindrome");
			}
			else
			{
				System.out.println("It is not Palindrome");
			}
		}
	}
}