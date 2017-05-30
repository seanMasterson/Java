public class Chair extends Furniture
{
	private HasGasLift hasGasLift;
	private String type;
	
	public HasGasLift getHasGasLift() 
	{	
		return hasGasLift;
	}
	public void setHasGasLift(HasGasLift hasGasLift) 
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

	public Chair(String colour, String materialType, String type,HasGasLift hasGasLift) 
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
