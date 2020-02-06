package Inheiritance;

public class Triangle extends Shape{
	
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle()
	{
		super();
		side1 = 0;
		side2 = 0;
		side3 = 0;
	}
	
	public Triangle(String name,String colour, double side1, double side2, double side3)
	{
		super(name,colour);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1()
	{
		return side1;
	}
	public void setSide1(double side1)
	{
		this.side1 = side1;
	}
	public double getSide2()
	{
		return side2;
	}
	public void setSide2(double side2)
	{
		this.side2 = side2;
	}
	public double getSide3()
	{
		return side3;
	}
	public void setSide3(double side3)
	{
		this.side3 = side3;
	}
	
	public double calcPer()
	{
		return side1+side2+side3;
	}
	public double calcArea()
	{
		double s = 0;
		double h = 0;
		double a = 0;
		s = (side1+side2+side3)/2;
		h =s*((s-side1)+(s-side2)+(s-side3));
		h= Math.sqrt(h);
		h = (h /side2 )* 2;
		
		a = h*side2/2;
		
		return a;
	}
	
}
