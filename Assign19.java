package mkt.automation;

public class Assign19 

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
		// calling non static and non parameterized method using outside class name from Assign18 
		Assign18 userlogin = new Assign18();
		userlogin.user();
	}
}