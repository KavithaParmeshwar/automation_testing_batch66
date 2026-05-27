package mkt.automation;

public class AreaCalculation8 {

	public static void main(String[] args) {

		// area and circumference of a square 
		int side = 5;
		int areaSquare = side * side;
		int perimeterSquare = 4 * side;

		System.out.println(areaSquare);
		System.out.println(perimeterSquare);

		// area and circumference of a rectangle	
		int length = 10;
		int width = 4;
		int areaRectangle = length * width;
		int perimeterRectangle = 2 * (length + width);

		System.out.println(areaRectangle);
		System.out.println(perimeterRectangle);

		// area and circumference of a triangle
		int base = 6;
		int height = 4;
		int side1 = 5, side2 = 5, side3 = 6;
		int areaTriangle = (base * height) / 2;
		int perimeterTriangle = side1 + side2 + side3;

		System.out.println(areaTriangle);
		System.out.println(perimeterTriangle);

		// area and circumference of a circle
		double radius = 7;
		double areaCircle = 3.14 * radius * radius;
		double circumferenceCircle = 2 * 3.14 * radius;

		System.out.println(areaCircle);
		System.out.println(circumferenceCircle);
	}
}

