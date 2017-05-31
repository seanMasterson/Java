public class Shape 
{
	private Colours colour;
	
	public enum Colours 
	{
		RED, GREEN, BLUE, YELLOW, BLACK,
		PINK, ORANGE, PURPLE, GREY, WHITE;
	};
	
	public Colours getColour() 
	{
		return colour;
	}
	public void setColour(Colours colour)
	{
		this.colour = colour;
	}
	
	public String draw() 
	{
		return "(This is a generic Polygon.) ";
	}
	
	public Shape() 
	{
		
	}
	
	public Shape(Colours colour) 
	{
		this();
		this.colour = colour;
	}
	
	@Override
	public String toString() 
	{
		return "Shape [" + draw() + ", Colour: " + getColour() + "]";
	}
}
