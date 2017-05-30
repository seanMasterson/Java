public class Bed extends Furniture	
{
	private HasHeadboard hasHeadBoard;
	private String size;

	public HasHeadboard getHasHeadBoard() 
	{
		return hasHeadBoard;		
	}
	public void setHasHeadBoard(HasHeadboard hasHeadBoard)
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
	
	public Bed(String colour, String materialType, String size, HasHeadboard hasHeadBoard) 
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
