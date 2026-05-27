package mkt.automation;

public class Assign31
{
    public static void main(String[] args)
    {        
    	double side = 4, length = 6, breath = 3, radius = 5, base = 4, height = 3;

        System.out.println("Square Area = " + Math.pow(side,2));
        System.out.println("Square Perimeter = " + (4*side));

        System.out.println("Rectangle Area = " + (length*breath));
        System.out.println("Rectangle Perimeter = " + (2*(length+breath)));

        System.out.println("Circle Area = " + (Math.PI*radius*radius));
        System.out.println("Circle Circumference = " + (2*Math.PI*radius));

        System.out.println("Triangle Area = " + (0.5*base*height));
        System.out.println("Triangle Perimeter = " + (base+height+5));
    }
}