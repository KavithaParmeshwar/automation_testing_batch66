package mkt.automation;

public class StringFunction0104_2 	// finding is a string is a palindrome or not
{
	public static void main(String[] args) 
	{
		String input = "madam";
		String output = "";

		for (int i=input.length()-1; i>=0; i--)
		{
			char c1=input.charAt(i);
			output = output+c1;
			
			/*iteration i=2, c1=c, output=c
			 *i=1, c1=b, output=c+b=cb
			 *i=0, c1=a, reverse=cb+a=cba
			 */
		}
		System.out.println("My Input is: " + input);
		System.out.println("My Output is: " + output);

		boolean b1=input.equals(output);
		if(input.equals(output)==true);
		if(b1);
		if(b1==true);
		
		if (input.equals(output))
		{
			System.out.println("String is a Palindrome");
		} else 
			System.out.println("Strig is not a Palindrome");
	}

}
