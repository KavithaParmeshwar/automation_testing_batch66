package mkt.automation1;

import mkt.automation.Assign111;

public class Assign111P2 
{

	public static void main(String[] args) 
	{

		Assign111 obj = new Assign111();

		// obj.privateMethod(); ❌ Not accessible

		// obj.defaultMethod(); ❌ Not accessible (different package)

		// obj.protectedMethod(); ❌ Not accessible via object (needs subclass)

		obj.publicMethod(); // ✅ Accessible everywhere

		// Accessing private method indirectly
		obj.accessPrivate(); // ✅ Works (through public method)
	}
}