public class Cat extends Pet implements Mammal
{
	private int numOfLives;
	
	@Override
	public String getTypeOfAnimal() 
	{
		return ", Animal Type: Cat";	
	}
	
	@Override
	public void sleep() 
	{
		System.out.println("The Cat Sleeps...");
	}
	
	@Override
	public void walk() 
	{
		System.out.println("Caper.");
	}
	
	public int getNumOfLives() 
	{
		return numOfLives;
	}
	public void setNumOfLives(int numOfLives) 
	{
		this.numOfLives = numOfLives;
	}
	
	public Cat() 
	{
		
	}
	
	public Cat(String name, int age, String breed, IsFemale isFemale, String colour, int numOfLives) 
	{
		super(name, age, breed, isFemale, colour);
		setNumOfLives(numOfLives);
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + getTypeOfAnimal() + ", Number of Lives: " + getNumOfLives() + "]";
	}
}
