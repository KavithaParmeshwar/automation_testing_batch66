package mkt.automation;

import java.util.Scanner;

public class Assign30
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int a = sc.nextInt();

        System.out.println("Enter a double:");
        double b = sc.nextDouble();

        System.out.println("Enter a byte:");
        byte c = sc.nextByte();

        System.out.println("Enter a short:");
        short d = sc.nextShort();

        System.out.println("Enter a long:");
        long e = sc.nextLong();

        System.out.println("Enter a float:");
        float f = sc.nextFloat();

        System.out.println("Enter a boolean (true/false):");
        boolean g = sc.nextBoolean();

        System.out.println("Enter a single word:");
        String h = sc.next();   // reads one word

        sc.nextLine(); // newline

        System.out.println("Enter a full sentence:");
        String i = sc.nextLine(); // reads full line

        System.out.println("int: " + a);
        System.out.println("double: " + b);
        System.out.println("byte: " + c);
        System.out.println("short: " + d);
        System.out.println("long: " + e);
        System.out.println("float: " + f);
        System.out.println("boolean: " + g);
        System.out.println("word (next): " + h);
        System.out.println("sentence (nextLine): " + i);
       
        sc.close();

    }
}