package mkt.automation;

public class StringFunction3103_2 
{
	public static void main(String[] args) 
	{
		String a = "school";
		
		for (int i=0; i<a.length(); i++)
			//for (int i=0; i<a.length()-1; i++)	//give output of S to O and not L
		{
			System.out.println(a.charAt(i));
		}
	}

}
