//Write a Program for hierarchical Level Inheritance

package mkt.automation;

//Parent Class
class Employee2
{
 void work()
 {
     System.out.println("Employee2 is working");
 }
}

//Child Class 1
class Developer extends Employee2
{
 void code()
 {
     System.out.println("Developer is coding");
 }
}

//Child Class 2
class Tester extends Employee2
{
 void test()
 {
     System.out.println("Tester is testing");
 }
}

//Main Class
public class Assign88
{
 public static void main(String[] args)
 {
     Developer d = new Developer();
     Tester t = new Tester();

     // Developer actions
     d.work();
     d.code();

     // Tester actions
     t.work();
     t.test();
 }
}