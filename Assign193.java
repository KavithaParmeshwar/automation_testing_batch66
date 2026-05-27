/*Assignment 193: Write a program to print name and Salary using the put() method in the Map Interface.*/

package mkt.automation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assign193 
{
	public static void main(String[] args) 
	{
		Map<String, Double> map = new HashMap<>();
		map.put("Amit", 45000.50);
		map.put("Sita", 52000.00);
		map.put("Ravi", 60000.75);
		map.put("Neha", 48000.25);

		System.out.println("Name and Salary Details:");

		for (Map.Entry<String, Double> output : map.entrySet()) 
		{
			System.out.println("Name: " + output.getKey() + "-> Salary: " + output.getValue());
		}
	}
}