public class Table extends Furniture
{
	private IsExpandable isExpandable;
	private String shape;
	
	public IsExpandable getIsExpandable() 
	{
			return isExpandable;
	}
	public void setExpandable(IsExpandable isExpandable) 
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
	
	public Table(String colour, String materialType, String shape, IsExpandable isExpandable) 
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
