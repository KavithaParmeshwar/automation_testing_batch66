/*Write a program to check whether a year is a 
 century year (divisible by 100) by accepting run time input*/

package mkt.automation;

import java.util.Scanner;

public class Assign55
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if(year % 100 == 0)
        {
            System.out.println("It is a Century Year");
        }
        else
        {
            System.out.println("It is NOT a Century Year");
        }
    }
}