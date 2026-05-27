/*WWrite a Program with all types of access specifier for constructor and
 *  try to access them outside the package without becoming the sub class*/

package mkt.automation1;

import mkt.automation.Assign117;

public class Assign117P2 
{
	public static void main(String[] args) 
	{

		// Accessible
		Assign117 obj1 = new Assign117(100); // public

		// NOT Accessible
		// Assign117 obj2 = new Assign117(10.5); // protected → ERROR
		// Assign117 obj3 = new Assign117("Hello"); // default → ERROR
		// Assign117 obj4 = new Assign117(); // private → ERROR
	}
}