/*Write A Program on Abstract Class with both Abstract and Concrete methods*/

package mkt.automation;

abstract class Module 
{
    abstract void dropDownList();

    void display() 
    {
        System.out.println("Displaying options");
    }
}

class Option extends Module 
{
    void dropDownList() 
    {
        System.out.println("Dropdown list is shown");
    }
}

public class Assign123 
{
    public static void main(String[] args) 
    {
        Option opt = new Option();

        opt.dropDownList(); // Abstract method
        opt.display();      // Concrete method
    }
}