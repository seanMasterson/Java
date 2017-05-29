public class Ex9_1 
{
	public static void main(String[] args) 
	{
		Table t0 = new Table();
		t0.setColour("Charcoal");
		t0.setMaterialType("Wood");
		t0.setShape("Oval");
		t0.setExpandable(true);
		
		Bed b0 = new Bed();
		b0.setColour("Brown");
		b0.setMaterialType("Wood");
		b0.setSize("Rectangular");
		b0.setHasHeadBoard(false);
		
		Chair c0 = new Chair();
		c0.setColour("Yellow");
		c0.setMaterialType("Wood");
		c0.setType("High Top");
		c0.setHasGasLift(false);
		
		Furniture[] f0 = {t0, b0, c0}; // Polymorphism
		
		for(Furniture item : f0)
		{
			System.out.println(item.toString());
			System.out.println();
		}
	}
}
