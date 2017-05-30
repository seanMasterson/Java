public class Dog extends Pet implements Mammal
{
	private String microChipNumber;
	private boolean isMicroChipped;
	
	@Override
	public void getTypeOfAnimal() 
	{
		System.out.println("Animal Type: Dog");
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
	
	public Dog(String name, String breed, int age, IsFemale isFemale) 
	{
		super();
	}
	
	@Override
	public String toString() 
	{
		return super.toString();
	}
}
