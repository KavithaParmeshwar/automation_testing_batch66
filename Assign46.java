//Write A Program to print -5 to -16 and  16 to 5 using for loop

package mkt.automation;

public class Assign46
{
	public static void main (String [] args)
	{
		// print -5 to -16
		System.out.println("Numbers from -5 to -16:");
		for(int i = -5; i >= -16; i--) 
		{
			System.out.println(i);

		}

		// print 16 to 5
		System.out.println();
		System.out.println("Numbers from 16 to 5:");
		for(int j = 16; j >= 5; j--) 
		{
			System.out.println(j);
		}
	}
}