public class Cat extends Pet implements Mammal
{
	private int numOfLives;
	
	@Override
	public void getTypeOfAnimal() 
	{
		System.out.println("Animal Type: Cat");	
	}
	
	@Override
	public void sleep() 
	{
			
	}
	
	@Override
	public void walk() 
	{
		
	}
	
	public Cat() 
	{
		
	}
	
	public Cat(String name, String breed, int age, boolean isFemale) 
	{
		super();
	}
	
	@Override
	public String toString() 
	{
		return super.toString();
	}
}
