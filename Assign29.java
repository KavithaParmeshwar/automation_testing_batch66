package mkt.automation;

public class Assign29
{
    // Constructor Overloading
    Assign29(char x, String y)
    {
        System.out.println("Constructor 1: " + x + " " + y);
    }
    
    Assign29(boolean b, char x, String y)
    {
        System.out.println("Constructor 2: " + b + " " + x + " " + y);
    }
    
    // Method Overloading
    static void login()
    {
        System.out.println("Launching browser of the website");
    }
    
    static void login(String username)
    {
        System.out.println("Entering Username: " + username);
    }
    
    static void login(String username, String password)
    {
    	System.out.println("Entering Username & Password: " + username + password);
    }

    // Main method
    public static void main(String[] args)
    {
        // Calling constructors
        new Assign29('A', "Shopping Website");
        new Assign29(true, 'B', "User Friendly");

        // Calling overloaded methods
        login();
        login("Admin", "1234");
    }
}