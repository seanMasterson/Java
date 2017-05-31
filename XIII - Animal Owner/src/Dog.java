public class Dog extends Pet implements Mammal
{
	public enum IsMicroChipped 
	{
		YES, NO;
		
		private int microChipNumber;
		
		private IsMicroChipped() 
		{
			this.microChipNumber = microChipNumber;
		}
		
		int getMicroChipNumber() 
		{
			return microChipNumber;
		}
	};
	
	@Override
	public String getTypeOfAnimal() 
	{
		return ", Animal Type: Dog";
	}
	
	@Override
	public void sleep() 
	{
		
	}
	
	@Override
	public void walk() 
	{
		
	}
	
	public Dog() 
	{
		
	}
	
	public Dog(String name, String breed, int age, String colour, IsFemale isFemale/*, IsMicroChipped isMicroChipped*/) 
	{
		super();
		
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + getTypeOfAnimal();
	}
}
