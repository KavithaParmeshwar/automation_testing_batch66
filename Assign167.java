/*Write a program to show all available remove functions in ArrayList*/

package mkt.automation;
import java.util.ArrayList;
import java.util.Arrays;

public class Assign167 
{
	public static void main(String[] args) 
	{
		ArrayList<String> input = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "B"));

		System.out.println("Original List: " + input);

		// 1. remove(int index)
		input.remove(2); // removes element at index 2
		System.out.println("After remove(index): " + input);

		// 2. remove(Object o)
		input.remove("B"); // removes first occurrence of "B"
		System.out.println("After remove(Object): " + input);

		// 3. removeAll(Collection c)
		ArrayList<String> removeList = new ArrayList<>(Arrays.asList("A", "D"));
		input.removeAll(removeList);
		System.out.println("After removeAll(Collection): " + input);

		// Add elements again for next demo
		input.addAll(Arrays.asList("E", "F", "G", "H"));

		// 4. removeIf(Predicate filter)
		input.removeIf(s -> s.startsWith("F")); // removes elements starting with F
		System.out.println("After removeIf(): " + input);

		// 5. clear()
		input.clear();
		System.out.println("After clear(): " + input);
	}
}