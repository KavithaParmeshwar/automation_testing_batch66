/*Write a program for constructor - single level inheritance using a 
 * non-parameterized super calling statement with explicit invocation*/

package mkt.automation;

class Director{
    
    Director(int a) {
        System.out.println("Constructor 1");
    }

    Director() {
        this(100);   // calling parameterized constructor
        System.out.println("Constructor 2");
    }
}

class Manager84 extends Director {
    
	Manager84(int a, double b) {
        super();   // calls Director()
        System.out.println("Constructor 3");
    }

	Manager84() {
        this(100, 23.4);
        System.out.println("Constructor 4");
    }
}

public class Assign84 {
    public static void main(String[] args) {
        new Manager84();
    }
}