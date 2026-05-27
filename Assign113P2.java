package mkt.automation1;

import mkt.automation.Assign113;

public class Assign113P2 
{
	public static void main(String[] args) 
	{

		Assign113 obj = new Assign113();

		// obj.privateMethod();   // ❌ Not accessible
		// obj.defaultMethod();   // ❌ Not accessible
		// obj.protectedMethod(); // ❌ Not accessible

		obj.publicMethod();      // ✅ Accessible
	}
}
