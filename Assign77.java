/*WAP to create relation between 2 classes having non-static methods using extends keyword. 
 * Single Level Inheritance from 2 different package*/

package mkt.automation;

class TestDemo
{
	void launchBrowser()
	{
		System.out.println("Browser is launched");
	}

	static void closeBrowser()
	{
		System.out.println("Browser is closed");
	}
}

class Login extends TestDemo
{
	void login()
	{
		System.out.println("Login test is executed");
	}

	static void report() 
	{
		System.out.println("Test report is generated");
	}
}

public class Assign77
{
	public static void main(String[] args)
	{
		Login t = new Login();

		t.launchBrowser(); // from TestDemo
		t.login();         // from Login

		TestDemo.closeBrowser(); // parent
		Login.report();          // child

	}
}