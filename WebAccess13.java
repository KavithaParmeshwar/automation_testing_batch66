package mkt.automation;

public class WebAccess13 
{

	void access() 
	{
		System.out.println("User Access Webpage");
	}

	void search() 
	{
		System.out.println("User Search Products");
	}

	void close() 
	{
		System.out.println("User Close Webpage");
	}

	public static void main(String[] args) 
	{

		WebAccess13 user = new WebAccess13();

		user.access();
		user.search();
		user.close();
	}
}
