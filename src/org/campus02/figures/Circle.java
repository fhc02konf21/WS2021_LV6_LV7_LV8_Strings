package org.campus02.figures;

public class Circle extends Figure {

	private double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * radius * 3.1415;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

}
