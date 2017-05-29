public class Furniture 
{
	private Colours colour;
	private MaterialType materialType;
	
	protected enum Colours
	{
		BEIGE, ORANGE, YELLOW, GREEN, BLUE, BROWN, WHITE
	};
	
	public Colours getColour() 
	{
		return colour;
	}
	public void setColour(Colours colour)
	{
		this.colour = colour;
	}
	
	public MaterialType getMaterialType() 
	{
		return materialType;
	}
	public void setMaterialType(MaterialType materialType) 
	{
		this.materialType = materialType;
	}
	
	public Furniture() 
	{
		
	}
	
	public Furniture(Colours colour, MaterialType materialType) 
	{
		this();
		this.colour = colour;
		setMaterialType(materialType);
	}
	
	@Override
	public String toString() 
	{
		return "Furniture Item [Colour: " + colour.toString().toLowerCase() + ", Material: " + materialType.toString().toLowerCase() + "]";
	}
}
