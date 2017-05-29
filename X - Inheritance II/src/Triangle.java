public class Triangle extends Shape
{
	public String draw() 
	{
		return "(This is a Triangle.)";
	}
	
	public Triangle() 
	{
		
	}
	
	public Triangle(Colours colour) 
	{
		super();
		draw();
		setColour(colour);
	}
	
	@Override
	public String toString() 
	{
		return  "Triangle" + " [" + draw() + ", Colour: " + getColour() + "]";
	}
}
