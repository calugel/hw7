package ge.ufc.main.util;

public class Rectangle extends Figure{
	
	// field variables
	private double width;
	private double length;
	
	
	// constructor methods
	public Rectangle() {}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	
	// getter methods
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	

	@Override
	public double getPerimeter() {
		return 2 * (width + length);
	}

	@Override
	public double getArea() {
		return width * length;
	}
	
	
	// printing methods
	@Override
	public void printFigureData() {
		System.out.println("The width = " + this.getWidth() + 
						   "\nThe length = " + this.getLength());
		
	}

	@Override
	public void sayHelloToTheFigure() {
		System.out.println("Hello, This is Rectangle");
	}
	


	@Override
	public boolean validateFigure() {
		if((this.getWidth()) <= 0 || (this.getLength() <= 0)) 
		{
			return false;
		}
		
		return true;
	}
	
}
