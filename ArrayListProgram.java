package mkt.automation;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) 
	{
		ArrayList<Double> a1=new ArrayList<Double>();
		a1.add(963.96);
        a1.add(1000.7);
        a1.add(96.96);
        a1.add(92.96);
        a1.add(2.96);
        a1.add(2, 6.35);
        System.out.println(a1);

		ArrayList<Double> a2=new ArrayList<Double>();
		a2.add(45.7);
        a2.add(23.09);
        a2.add(12.45);
        a2.add(23.17);
        a2.add(5.96);
        System.out.println(a2);
        
      //  a1.addAll(a2);
        a1.addAll(1, a2);
        System.out.println(a1);
        
       boolean b1= 		a1.equals(a2);
       System.out.println(b1);
	}

}
