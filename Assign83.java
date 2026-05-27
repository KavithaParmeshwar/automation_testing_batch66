/*Write a program for constructor inheritance using the super 
 * calling statement with Implicit Invocation*/

package mkt.automation;

class Friend1{
    
	Friend1() {
        System.out.println("Jay");
    }
}

class Friend2 extends Friend1 {
    
	Friend2(int a, double b) {
        System.out.println("Hey Kavi");
    }

	Friend2() {
        this(100, 23.4);
        System.out.println("Its Movie Time @ Durander 2");
    }
}
public class Assign83 {
    public static void main(String[] args) {
        new Friend2();
    }
}