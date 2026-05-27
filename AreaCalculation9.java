package mkt.automation;

public class AreaCalculation9 {

	public static void main(String[] args) 

	{
		square(5);
		rectangle(10,5);
		triangle(5,5,5,5,5);
		circle(7);
	}

	// area and circumference of a square
	static void square (int side )
	{
		int areaSquare = side * side;
		int perimeterSquare = 4 * side;

		System.out.println(areaSquare);
		System.out.println(perimeterSquare);
	}

	// area and circumference of a rectangle
	static void rectangle (int length, int width)
	{
		int areaRectangle = length * width;
		int perimeterRectangle = 2 * (length + width);

		System.out.println(areaRectangle);
		System.out.println(perimeterRectangle);
	}

	// area and circumference of a triangle
	static void triangle (int base, int height, int side1, int side2, int side3)
	{
		int areaTriangle = (base * height) / 2;
		int perimeterTriangle = side1 + side2 + side3;

		System.out.println(areaTriangle);
		System.out.println(perimeterTriangle);
	}

	// area and circumference of a circle
	static void circle (double radius)
	{
		double areaCircle = 3.14 * radius * radius;
		double circumferenceCircle = 2 * 3.14 * radius;

		System.out.println(areaCircle);
		System.out.println(circumferenceCircle);

	}
}
