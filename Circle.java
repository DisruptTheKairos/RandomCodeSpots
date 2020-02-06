package Inheiritance;

public class Circle extends Shape{

	private double radius;
	public Circle()
	{
		super();
		radius = 0.0;
	}
	public Circle(String name,String colour, double radius) {
		super(name,colour);
		this.radius = radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public double calcDia()
	{
		return radius * 2;
	}
	public double calcPer()
	{
		return Math.PI * calcDia();
	}
	public double calcArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}
	public String toString()
	{
		return String.format("\n\n\t%s %s, %s \n\tRadius: %5.2f\n\tDiameter: %5.2f\n\tCirc: %5.2f\n\tArea: %5.2f", super.getColour(),super.getName(), radius, calcDia(),calcPer(), calcArea());
	}
}
