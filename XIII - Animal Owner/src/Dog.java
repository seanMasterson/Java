public class Dog extends Pet implements Mammal
{
	private IsMicroChipped isMicroChipped;
	private int microChipNumber;
	
	public enum IsMicroChipped 
	{
		YES, NO;
	};
	
	public IsMicroChipped getIsMicroChipped() 
	{
		return isMicroChipped;
	}
	
	public void setIsMicroChipped(IsMicroChipped isMicroChipped) 
	{
		this.isMicroChipped = isMicroChipped;
	}
	
	@Override
	public String getTypeOfAnimal() 
	{
		return ", Animal Type: Dog";
	}
	
	@Override
	public void sleep() 
	{
		System.out.println("The Dog Sleeps...");
	}
	
	@Override
	public void walk() 
	{
		System.out.println("Trot.");
	}
	
	public int getMicroChipNumber() 
	{
		/*if(setIsMicroChipped(isMicroChipped) == IsMicroChipped.YES)
			return;*/
		return microChipNumber;
	}
	public void setMicroChipNumber(int microChipNumber)
	{
		this.microChipNumber = microChipNumber;
	}

	public Dog() 
	{
		
	}
	
	public Dog(String name, int age, String breed, IsFemale isFemale, String colour, IsMicroChipped isMicroChipped, int microChipNumber) 
	{
		super(name, age, breed, isFemale, colour);
		setIsMicroChipped(isMicroChipped);
		setMicroChipNumber(microChipNumber);
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + getTypeOfAnimal() + ", Microchipped? (YES/NO): " + getIsMicroChipped() + ", Microchip Number: " + getMicroChipNumber() + "]";
	}
}
