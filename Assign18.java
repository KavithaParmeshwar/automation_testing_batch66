package mkt.automation;

public class Assign18 

{
	// parameterized non static method
	void user()
	{
		System.out.println("Login");
		System.out.println("Enter Credentials");
		System.out.println("Logout");
	}

	public static void main(String[] args)
	{
		// calling non static and non parameterized method using class name
		Assign18 userlogin = new Assign18();
		userlogin.user();
	}
}