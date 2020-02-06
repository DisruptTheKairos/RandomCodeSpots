package Inheiritance;

public class Shape {
		private String name;
		private String colour;
		
		public Shape()
		{
			name = "";
			colour ="";
		}
		public Shape(String name, String colour)
		{
			this.name = name;
			this.colour = colour;
		}
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name = name;
		}
		
		public String getColour()
		{
			return colour;
		}
		public void setColour()
		{
			this.colour = colour;
		}
		public double calcArea()
		{
			return 0;
		}
		public double caclPer() {
			return 0;
		}
		public String toString() {
			return String.format("\n\n\t%s %s, %s ", colour , name);
		}
		
}
