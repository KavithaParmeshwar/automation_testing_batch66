package mkt.automation;

public class StringFunction3103 
{

	public static void main(String[] args) 
	{
		String k="Automation Testing Batch 66";
		String k1="Automation Testing Batch 66";

		System.out.println(k.length());		//size count of the variable
		System.out.println(k.charAt(11));		//position of the character B
		System.out.println(k.indexOf('t'));		//t char position at 2
		System.out.println(k.lastIndexOf('t'));	//t char position at 21
		System.out.println(k.concat(" - By MKT"));	//concatenating string k with another string
		System.out.println(k.trim());		//removing extra spacing before and after string
		System.out.println(k.length());
		System.out.println(k.substring(11));		//gives results after 11 character
		System.out.println(k.substring(k.length()-1));	//
		System.out.println(k.toLowerCase());
		System.out.println(k.toUpperCase());
		
		boolean result = k.equals(k1);
		System.out.println(result);
		
		boolean result1 = k1.contains(k);
		System.out.println(result1);
		
		boolean result2 = k1.equalsIgnoreCase("Automation Testing Batch 66");
		System.out.println(result2);


	}

}
