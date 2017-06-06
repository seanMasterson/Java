public abstract class Pet 
{
	private String name;
	private String breed;
	private int age;
	private String colour;
	private IsFemale isFemale;
	
	private static int petCounter = 1;
	private int count;
	
	public enum IsFemale {YES, NO};
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getBreed() 
	{
		return breed;
	}
	public void setBreed(String breed) 
	{
		this.breed = breed;
	}
	
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public String getColour() 
	{
		return colour;
	}
	public void setColour(String colour) 
	{
		this.colour = colour;
	}
	
	public IsFemale getIsFemale() 
	{
		return isFemale;
	}
	public void setIsFemale(IsFemale isFemale) 
	{
		this.isFemale = isFemale;
	}
	
	public abstract String getTypeOfAnimal();
	
	public Pet() 
	{
		count = petCounter++;
	}
	
	public Pet(String name, int age, String breed, IsFemale isFemale, String colour) 
	{
		this();
		this.name = name;
		this.age = age;
		this.breed = breed;
		setIsFemale(isFemale);
		this.colour = colour;
		setIsFemale(isFemale);
	}
	
	@Override
	public String toString() 
	{
		return String.format("Pet [%d]", count) + " [Name: " + getName() + 
				", Age: " + getAge() + ", Breed: " + getBreed() + ", Female (YES/NO): " + getIsFemale() +
				",\n\tColour: " + getColour();
	}
}
