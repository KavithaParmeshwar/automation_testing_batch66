package mkt.automation;

public class AreaOfCircleMathPi {

	public static void main(String[] args) {
		double r=10;//local
		double area=Math.PI*r*r;;//local but Pi is a global
		System.out.println(area);
		
	}

}
