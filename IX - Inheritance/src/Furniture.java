public class Furniture 
{
	private String colour;
	private String materialType;
	
	public String getColour() 
	{
		return colour;
	}
	public void setColour(String colour)
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
	
	public Furniture(String colour, String materialType) 
	{
		this();
		this.colour = colour;
		setMaterialType(materialType);
	}
	
	@Override
	public String toString() 
	{
		return "Furniture Item [Colour: " + colour + ", Material: " + getMaterialType() + "]";
	}
}
