/*Write a program with different string function mentioned below*/

package mkt.automation;

public class Assign127 
{
	public static void main(String[] args) 
	{

		String st1 = "  Hello Automation Testing Batch 66  ";
		String st2 = "hello automation testing batch 66";

		// 1. length()
		System.out.println("Length: " + st1.length());

		// 2. toLowerCase()
		System.out.println("Lowercase: " + st1.toLowerCase());

		// 3. toUpperCase()
		System.out.println("Uppercase: " + st1.toUpperCase());

		// 4. trim()
		System.out.println("Trimmed: " + st1.trim());

		// 5. charAt(index)
		System.out.println("Character at index 2: " + st1.charAt(2));

		// 6. indexOf(char)
		System.out.println("Index of 'A': " + st1.indexOf('A'));

		// 7. substring(start index)
		System.out.println("Substring from index 6: " + st1.substring(6));

		// 8. substring(start index, end index)
		System.out.println("Substring (6, 16): " + st1.substring(6, 16));

		// 9. equals()
		System.out.println("Equals: " + st1.equals(st2));

		// 10. contains()
		System.out.println("Contains 'Testing': " + st1.contains("Testing"));

		// 11. equalsIgnoreCase()
		System.out.println("Equals Ignore Case: " + st1.equalsIgnoreCase(st2));
	}
}