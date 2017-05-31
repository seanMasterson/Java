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
		
	}
	
	@Override
	public void walk() 
	{
		
	}
	
	public Hamster() 
	{
		
	}
	
	public Hamster(String name, String breed, int age, IsFemale isFemale) 
	{
		super();
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + getTypeOfAnimal();
	}
}
