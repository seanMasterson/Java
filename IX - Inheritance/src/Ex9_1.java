public class Ex9_1 
{
	public static void main(String[] args) 
	{
		Table t0 = new Table();
		t0.setColour(Furniture.Colours.GREEN);
		t0.setMaterialType(MaterialType.ALDER);
		t0.setShape("Oval");
		t0.setExpandable(IsExpandable.YES);
		
		Bed b0 = new Bed();
		b0.setColour(Furniture.Colours.BROWN);
		b0.setMaterialType(MaterialType.PINE);
		b0.setSize("Rectangular");
		b0.setHasHeadBoard(HasHeadboard.NO);
		
		Chair c0 = new Chair();
		c0.setColour(Furniture.Colours.BEIGE);
		c0.setMaterialType(MaterialType.MAHOGANY);
		c0.setType("High Top");
		c0.setHasGasLift(HasGasLift.NO);
		
		Furniture[] f0 = {t0, b0, c0}; // Polymorphism
		
		for(Furniture item : f0)
		{
			System.out.println(item.toString());
			System.out.println();
		}
	}
}
