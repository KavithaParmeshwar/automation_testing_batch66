/*Write A Program on Super Keyword*/

package mkt.automation;

class Company 
{
	String companyName = "TCS";

	Company() 
	{
		System.out.println("Company Constructor Called");
	}

	void showCompany() 
	{
		System.out.println("Company Name: " + companyName);
	}
}

class EmployeeT extends Company 
{
	String companyName = "Infosys";

	EmployeeT() 
	{
		super(); // calling parent constructor
		System.out.println("Employee Constructor Called");
	}

	void display() 
	{
		System.out.println("Employee Company: " + companyName);
		System.out.println("Parent Company: " + super.companyName);

		super.showCompany(); // calling parent method
	}
}

public class Assign119 {
	public static void main(String[] args) {
		EmployeeT emp = new EmployeeT();

		emp.display();
	}
}