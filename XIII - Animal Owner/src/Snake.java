public class Snake extends Pet
{
	@Override
	public String getTypeOfAnimal() 
	{
		return ", Animal Type: Snake";
	}
	
	public Snake() 
	{
		
	}
	
	public void walk() 
	{
		System.out.println("Slither.");
	}
	
	public void eats() 
	{
		System.out.println("The Serpent Eats...");
	}
	
	public Snake(String name, int age, String breed, IsFemale isFemale, String colour) 
	{
		super(name, age, breed, isFemale, colour);
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + getTypeOfAnimal() + "]";
	}
}
