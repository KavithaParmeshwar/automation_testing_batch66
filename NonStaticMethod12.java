package mkt.automation;

public class NonStaticMethod12 {

	void amazon() {
		System.out.println("Amazon Online Shopping Destination");
	}

	public static void main(String[] args) {

		NonStaticMethod12 atoz = new NonStaticMethod12();
		atoz.amazon();

	}
}