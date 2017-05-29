public class Furniture 
{
	private Colours colour;
	private String materialType;
	
	protected enum Colours
	{
		RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
	};
	
	public Colours getColour() 
	{
		return colour;
	}
	public void setColour(Colours colour)
	{
		this.colour = colour;
	}
	
	public String getMaterialType() 
	{
		return materialType;
	}
	public void setMaterialType(String materialType) 
	{
		switch(materialType) 
		{
			case "Wood":
			case "Plastic":
			case "Stone":
			case "Aluminium":
				this.materialType = materialType;
				break;
			default:
				System.out.println("Wood");
				this.materialType = "Wood";
		}
	}
	
	public Furniture() 
	{
		
	}
	
	public Furniture(Colours colour, String materialType) 
	{
		this();
		this.colour = colour;
		setMaterialType(materialType);
	}
	
	@Override
	public String toString() 
	{
		return "Furniture Item [Colour: " + getColour() + ", Material: " + getMaterialType() + "]";
	}
}
