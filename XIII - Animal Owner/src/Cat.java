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
			
	}
	
	@Override
	public void walk() 
	{
		
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
	
	public Cat(String name, String breed, int age, IsFemale isFemale, int numOfLives) 
	{
		super();
		setNumOfLives(numOfLives);
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + getTypeOfAnimal() + ", Number of Lives: " + getNumOfLives();
	}
}
