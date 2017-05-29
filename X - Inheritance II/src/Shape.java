/*import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.awt.List;
*/
public class Shape 
{
	private Colours colour;
	
	public enum Colours 
	{
		RED,
		GREEN,
		BLUE,
		YELLOW,
		BLACK,
		PINK,
		ORANGE,
		PURPLE,
		GREY,
		WHITE;
		/*private static final List COLOURS = Collections.unmodifiableList(Arrays.asList(values()));
		private static final Random RAND = new Random();*/
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
