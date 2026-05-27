/*Write A Program on Interface with 2 Abstract methods*/

package mkt.automation;

interface Calculator {
	void add(int a, int b);
	void subtract(int a, int b);
}

class MyCalculator implements Calculator {

	public void add(int a, int b) {
		System.out.println("Addition: " + (a + b));
	}

	public void subtract(int a, int b) {
		System.out.println("Subtraction: " + (a - b));
	}
}

public class Assign124 {
	public static void main(String[] args) {
		MyCalculator cal = new MyCalculator();

		cal.add(10, 5);
		cal.subtract(10, 5);
	}
}