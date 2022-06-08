package ge.ufc.main;
import ge.ufc.main.util.*;

public class Main {

	public static void main(String[] args) {
		

		/* RECTANGLE */
		
		new Rectangle().sayHelloToTheFigure();	// hello, this is rectangle
		printFigure(new Rectangle(4,5));	// printing - width, length, area and perimeter
		
		System.out.println(new Rectangle(0,5).validateFigure());	// false
		validatingFigure(new Rectangle(0,5));	// invalid figure
		
		System.out.println(new Rectangle(4,5).validateFigure());	// true
		validatingFigure(new Rectangle(4,5));	// hello rectangle
		
		
		
		
		
		/* TRIANGLE */
		
		Triangle t = new Triangle(5,5,8);
		t.setHeight(3);
		t.sayHelloToTheFigure();	// hello, this is triangle
		printFigure(t);	// printing - a,b,c, area and perimeter
		
		System.out.println(new Triangle(6,6,12).validateFigure());	// false
		validatingFigure(new Triangle(6,6,12));		// invalid figure
		
		System.out.println(new Triangle(6,6,11).validateFigure());	//true
		validatingFigure(new Triangle(6,6,11)); 	// hello triangle
				
		
		
	}
	
	
	// static methods
	
	public static void printFigure(IFigure figure) {
		figure.printFigureData();
		figure.printFigureAreaAndLength();
	}
	
	public static void validatingFigure(IFigureAnother figure) {
		if(figure.validateFigure() == true && figure instanceof Triangle) {
			System.out.println("Hello Triangle");
		}else if(figure.validateFigure() == true && figure instanceof Rectangle) {
			System.out.println("Hello Rectangle");
		}else {
			System.out.println("Invalid Figure");
		}
		
	}

}


