/*Write  a program with combination of for Loop and scanner class*/

package mkt.automation;

import java.util.Scanner;

public class Assign56
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 3; i++)
        {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println(num);
        }
    }
}