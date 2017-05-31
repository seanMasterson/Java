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
	
	public Snake(String name, String breed, int age, IsFemale isFemale) 
	{
		super();
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + getTypeOfAnimal();
	}
}
