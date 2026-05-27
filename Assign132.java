/*Write A Program on String Function using toCharArray concept*/

package mkt.automation;
import java.util.Arrays;

public class Assign132 
{
	public static void main(String[] args) 
	{
		String st="Misslie-Man";

		char [] ch1=	st.toCharArray();

		for(int i=0;i<st.length();i++)
		{
			System.out.println(ch1[i]);
		}
		System.out.println(Arrays.toString(ch1));	//representational format of presentation
	}
}