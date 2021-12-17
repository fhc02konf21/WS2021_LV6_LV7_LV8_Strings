package org.campus02.figures;

public class DemoApp {

	public static void main(String[] args) {

		FigureManager fm = new FigureManager();
		
		fm.add(new Circle(15));
		fm.add(new Circle(14.1));
		fm.add(new Rectangle(100, 200));
		
		System.out.println("Perimeter: " + fm.getMaxPerimeter());
		System.out.println("getAreaBySizeCategories: " + fm.getAreyBySizeCategories());;

	}

}
