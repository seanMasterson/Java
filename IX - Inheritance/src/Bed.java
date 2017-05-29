public class Bed extends Furniture	
{
	private boolean hasHeadBoard;
	private String size;

	public String getHasHeadBoard() 
	{
		if(hasHeadBoard == true)
			return "Yes";
		else
			return "No";		
	}
	public void setHasHeadBoard(boolean hasHeadBoard)
	{
		this.hasHeadBoard = hasHeadBoard;
	}
	
	public String getSize() 
	{
		return size;
	}

	public void setSize(String size) 
	{
		this.size = size;
	}

	public Bed() 
	{
		
	}
	
	public Bed(String colour, String materialType, String size, boolean hasHeadBoard) 
	{
		super();
		this.size = size;
		setHasHeadBoard(hasHeadBoard);
	}
	
	@Override
	public String toString() 
	{
		return "Bed [Colour: " + getColour() + ", Material: " + getMaterialType() +
				", Size: " + size + ", Head Board: " + getHasHeadBoard() + "]";	
	}
}
