public class Circle extends Shape
{
	private int radius;
	
	public int getRadius()
	{
		return radius;
	}
	public void setRadius(int radius) 
	{
		this.radius = radius;
	}
	
	public String draw() 
	{
		return "(This is a Circle.)";
	}
	
	public Circle() 
	{
		
	}
	
	public Circle(int radius, Colours colour) 
	{
		super();
		setRadius(radius);
		draw();
		setColour(colour);
	}
	
	@Override
	public String toString() 
	{
		return "Circle [" + draw() + ", Colour: " + getColour() +  ", Radius: " + radius + "]";
	}
}
