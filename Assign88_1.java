/*Write A Program on super calling statement using
 non-parameterized super calling statement*/

package mkt.automation;

//Parent Class
class CH88
{
 CH88()
 {
     System.out.println("Parent class constructor");
 }
}

//Child Class
public class Assign88_1 extends CH88
{
	Assign88_1()
 {
     super();  // Non-parameterized super call
     System.out.println("Child class constructor");
 }

 public static void main(String[] args)
 {
     new Assign88_1(); // Creating object
 }
}