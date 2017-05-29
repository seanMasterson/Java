public class Chair extends Furniture
{
	private boolean hasGasLift;
	private String type;
	
	public String getHasGasLift() 
	{
		if(hasGasLift == true)
			return "Yes";
		else
			return "No";
	}
	public void setHasGasLift(boolean hasGasLift) 
	{
		this.hasGasLift = hasGasLift;
	}
	
	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}

	public Chair() 
	{
		
	}

	public Chair(String colour, String materialType, String type, boolean hasGasLift) 
	{
		super();
		this.type = type;
		setHasGasLift(hasGasLift);
	}
	
	@Override
	public String toString() 
	{
		return "Chair [Colour: " + getColour() + ", Material: " + getMaterialType() + 
				", Type: " + type + ", Gas Lift: " + getHasGasLift() + "]";
	}
}
