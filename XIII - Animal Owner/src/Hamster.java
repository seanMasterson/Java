public class Hamster extends Pet implements Mammal
{
	@Override
	public String getTypeOfAnimal() 
	{
		return ", Animal Type: Hamster";
	}
	
	@Override
	public void sleep() 
	{
		System.out.println("The Hamster Sleeps...");
	}
	
	@Override
	public void walk() 
	{
		System.out.println("Scurry.");
	}
	
	public Hamster() 
	{
		
	}
	
	public Hamster(String name, int age, String breed, IsFemale isFemale, String colour) 
	{
		super(name, age, breed, isFemale, colour);
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + getTypeOfAnimal();
	}
}
