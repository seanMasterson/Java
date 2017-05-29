public class Table extends Furniture
{
	private boolean isExpandable;
	private String shape;
	
	public String getIsExpandable() 
	{
		if(isExpandable == true)
			return "Yes";
		else
			return "No";
	}
	public void setExpandable(boolean isExpandable) 
	{		
		this.isExpandable = isExpandable;
	}
	
	public String getShape() 
	{
		return shape;
	}
	public void setShape(String shape) 
	{
		this.shape = shape;
	}
	
	public Table() 
	{
		
	}
	
	public Table(String colour, String materialType, String shape, boolean isExpandable) 
	{
		super();
		this.shape = shape;
		setExpandable(isExpandable);
	}
	
	@Override
	public String toString() 
	{
		return "Table [Colour: " + getColour() + ", Material: " + getMaterialType() + 
				", Shape: " + shape + ", Expandable: " + getIsExpandable() + "]";
	}
}
