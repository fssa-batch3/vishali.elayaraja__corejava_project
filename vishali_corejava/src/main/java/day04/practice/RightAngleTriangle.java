package day04.practice;

public class RightAngleTriangle extends Polygon {
	
	
	protected double length;
	protected double breadth;
	protected double hypotenuse;  
	protected int side;
	
	
	public RightAngleTriangle(double length, double breadth ,double  hypotenuse, int side) throws Exception {
		
		super(3);
		
		if(length <= 0 || breadth <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.length = length;
		this.breadth = breadth;
		this.hypotenuse= hypotenuse;
	}

	
	@Override
	public double calculateArea() {
		return this.length * this.breadth;
	}
	
	public int getNumberOfSides() {
		return super.numberOfSides;
	}


	@Override
	public double circumference() {
		return 3*side;
	}

}


