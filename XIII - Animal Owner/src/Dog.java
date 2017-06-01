public class Dog extends Pet implements Mammal
{
	private IsMicroChipped isMicroChipped;
	
	public enum IsMicroChipped 
	{
		YES, NO;
		private int microChipNumber;
		/*
		private IsMicroChipped() 
		{
			this.microChipNumber = microChipNumber;
		}
		
		int getMicroChipNumber(int microChipNumber) 
		{
			return microChipNumber;
		}*/
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
	
	public Dog() 
	{
		
	}
	
	public Dog(String name, int age, String breed, IsFemale isFemale, String colour, IsMicroChipped isMicroChipped) 
	{
		super(name, age, breed, isFemale, colour);
		setIsMicroChipped(isMicroChipped);
		/*walk();
		sleep();*/
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + getTypeOfAnimal() + ", Micro Chipped (YES/NO): " + getIsMicroChipped() + "]";
	}
}
