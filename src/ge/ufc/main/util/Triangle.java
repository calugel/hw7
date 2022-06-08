package ge.ufc.main.util;

public class Triangle extends Figure{
	
	// field variables
	private double a;
	private double b;
	private double c;
	private double ch;
	
	
	//constructor methods
	public Triangle() {}
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void setHeight(double ch) {
		this.ch = ch;
	}
	
	
	
	// getter methods
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public double getHeight() {
		return ch;
	}

	@Override
	public double getPerimeter() {
		return a + b + c;
	}

	@Override
	public double getArea() {
		return (ch * c) / 2; 
	}
	
	
	
	// printing methods
	@Override
	public void printFigureData() {
		System.out.println("Side A = " + this.getA() + 
						"\nSide B = " + this.getB() + 
						"\nSide C = " + this.getC());
	}

	@Override
	public void sayHelloToTheFigure() {
		System.out.println("\nHello, This is Triangle");
	}

	@Override
	public boolean validateFigure() {
		if((this.getA() <= 0) || (this.getB() <= 0) || (this.getC() <= 0)
		 || (this.getA()+this.getB() <= this.getC())
		 || (this.getA()+this.getC() <= this.getB())
		 || (this.getC()+this.getB() <= this.getA())) 
		{	
			return false;
		}
		
		return true;
	}

}
