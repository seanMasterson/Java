public abstract class Pet 
{
	private String name;
	private String breed;
	private int age;
	private String colour;
	private IsFemale isFemale;
	
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
		
	}
	
	public Pet(String name, String breed, int age, String colour, IsFemale isFemale) 
	{
		this();
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.colour = colour;
		setIsFemale(isFemale);
	}
	
	@Override
	public String toString() 
	{
		return "Pet [Name: " + getName() +  ", Breed: " + getBreed() + 
			   ", Age: " + getAge() +  ", Colour: ";
	}
}
