package day05.solved;

interface Polygon {

	public double area(double a, double b);
}

class Rectangle implements Polygon {

	@Override
	public double area(double a, double b) {
		System.out.println("Calculating Rectangle area");
		return a * b;
	}
}

class RightAngledTriangle implements Polygon {
	@Override
	public double area(double a, double b) {
		System.out.println("Calculating RightAngledTriangle area");
		return (0.5 * a * b);
	}
}

public class TestInfPolygon {

	public static void main(String[] args) {
		// Creating a new object p using Rectangle class reference from Polygon
		// interface
		Polygon p = new Rectangle();
		// Passing two arguments via area method
		double area = p.area(5, 6);
		System.out.println("Calculated Area: " + area);

		p = new RightAngledTriangle();
		area = p.area(5, 6);
		System.out.println("Newly calculated Area: " + area);
	}
}