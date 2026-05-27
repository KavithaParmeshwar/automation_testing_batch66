package mkt.automation;

public class StaticMethods7 
{

	public static void main(String[] args) 
	{

        int a = 01;
        int b = 17;

        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);
        modulus(a, b);

	}

	static void addition(int a, int b) {
		System.out.println(a + b);
	}

	static void subtraction(int a, int b) {
		System.out.println(a - b);
	}

	static void multiplication(int a, int b) {
		System.out.println(a * b);

	}
	static void division(int a, int b) {
		System.out.println(a / b);
	}
	
    static void modulus(int a, int b) {
        System.out.println(a % b);
    }
}