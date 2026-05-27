/*Write a program to trim the space from starting and ending 
 * of the given word"          Manual           "*/

package mkt.automation;

public class Assign130 
{
	public static void main(String[] args) 
	{
		String st1 = "AUTOMATION";
		String st2 = "automation";
		String st3 = "AUTOMATION";

		// equals() → case-sensitive
		System.out.println("Using equals():");
		System.out.println("st1 equals st2: " + st1.equals(st2));
		System.out.println("st1 equals st3: " + st1.equals(st3));

		// equalsIgnoreCase() → case-insensitive
		System.out.println();
		System.out.println("Using equalsIgnoreCase():");
		System.out.println("st1 equalsIgnoreCase st2: " + st1.equalsIgnoreCase(st2));
		System.out.println("st1 equalsIgnoreCase st3: " + st1.equalsIgnoreCase(st3));
	}
}