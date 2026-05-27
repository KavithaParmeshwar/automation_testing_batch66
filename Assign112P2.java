package mkt.automation1;

import mkt.automation.Assign112;

public class Assign112P2 extends Assign112 
{

	public void testAccess() 
	{

		// privateMethod(); ❌ Not accessible

		// defaultMethod(); ❌ Not accessible (different package)

		protectedMethod(); // ✅ Accessible via inheritance

		publicMethod(); // ✅ Accessible
	}

	public static void main(String[] args) 
	{
		Assign112P2 obj = new Assign112P2();
		obj.testAccess();
	}
}