public class Rectangle extends Shape 
{
	private int height;
	private int width;
	private int area;
	
	public int getHeight() 
	{
		return height;
	}
	public void setHeight(int height) 
	{
		this.height = height;
	}

	public int getWidth() 
	{
		return width;
	}
	public void setWidth(int width) 
	{
		this.width = width;
	}

	public int getArea() 
	{
		return area;
	}
	public void setArea(int height, int width) 
	{
		this.area = height * width;
	}

	public String draw() 
	{
		return "(This is a Rectangle.)";
	}
	
	public Rectangle() 
	{
		
	}
	
	public Rectangle(int height, int width, Colours colour) 
	{
		super();
		setHeight(height);
		setWidth(width);
		setArea(height, width);
		setColour(colour);
	}
	
	@Override
	public String toString() 
	{
		return "Rectangle [" + draw() + ", Colour: " + getColour() +  ", Height: " + height + 
				", Width: " + width + ", Area: " + getArea() + "]";
	}
}
