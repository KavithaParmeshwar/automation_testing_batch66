/*Write a program for single-level inheritance using a static and Non-static 
method in the different class name in the single package explorer*/

package mkt.automation1;

import mkt.automation.Assign76;

class Assign76P2 extends Assign76
{
    static void manage()
    {
        System.out.println("Manager is managing work");
    }

    public static void main(String[] args)
    {
    	Assign76P2 ASP2 = new Assign76P2();

    	ASP2.work();   // from Assign76 - package 1
    	ASP2.manage(); // from Assign76P2 - package 2
    }
}