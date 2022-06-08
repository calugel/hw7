package ge.ufc.main.util;

public abstract class Figure implements IFigure, IFigureAnother{
	
	public abstract double getPerimeter();
	public abstract double getArea();
	
	@Override
	public void printFigureAreaAndLength() {
		System.out.println("area = " + this.getArea() + " - " + 
						   "perimeter = " + this.getPerimeter());
	}
}
