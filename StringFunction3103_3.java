package mkt.automation;

public class StringFunction3103_3 
{
	public static void main(String[] args) 
	{
		String a = "abc";
		String reverse = "";
		
		System.out.println(a.length());
		
		for (int i=a.length()-1; i>=0; i--)
		{
			char c1=a.charAt(i);
			reverse = reverse+c1;
			/*iteration i=2, c1=c, reverse=c
			 *i=1, c1=b, reverse=c+b=cb
			 *i=0, c1=a, reverse=cb+a=cba
			 */
		}
		System.out.println(reverse);
	}

}
