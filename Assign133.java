/*Write A Program to accept the array input at run time*/

package mkt.automation;
import java.util.Arrays;
import java.util.Scanner;

public class Assign133 
{
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Please enter the size of your array:" );
		int [] rollno=new int[sc1.nextInt()];

		for(int i=0;i<rollno.length;i++)
		{
			System.out.println("Please enter the value at the indexing-> "+i);
			rollno[i]=sc1.nextInt();
		}
		System.out.println("Your final Array is->"+Arrays.toString(rollno));
		sc1.close();
	}
}