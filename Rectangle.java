package Inheiritance;

public class Rectangle extends Shape{
	
	private double length;
	private double breadth;
	public Rectangle()
	{
		super();
		length = 0;
		breadth = 0;
	
	}
	public Rectangle(double length,double breadth, String colour, String name)
	{
		super(name,colour);
		this.length = length;
		this.breadth = breadth;
	}
		
	public double getLength() {
		return length;
	}
	public void setLength(double length)
	{
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth)
	{
		this.breadth = breadth;
	}
	
	public double calcPerimeter() {
		return length*2 + breadth * 2;
	}
	public double calcArea () {
		return length * breadth;
	}
	
	public boolean isSquare() {
		if(length == breadth)
			return true;
			else 
				return false;
	}
	public String toString()
	{
		return String.format("\n\n\t%s %s, %s \n\tlength: %5.2f\n\tbreadth: %5.2f\n\tPerimeter: %5.2f\n\tArea: %5.2f \n\tSquare: %15s", super.getColour(),super.getName(), length,breadth, calcPerimeter(), calcArea(),isSquare()? "This is a square": "This is not a square");
	}

	

}
