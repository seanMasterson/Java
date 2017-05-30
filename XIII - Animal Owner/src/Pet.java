public abstract class Pet 
{
	private String name;
	private String breed;
	private int age;
	private String colour;
	private IsFemale isFemale;
	
	public enum IsFemale {YES, NO};
	
	public String getName(String name) 
	{
		return name;
	}
	public void setName() 
	{
		this.name = name;
	}
	
	public String getBreed(String breed) 
	{
		return breed;
	}
	public void setBreed() 
	{
		this.breed = breed;
	}
	
	public int getAge(int age) 
	{
		return age;
	}
	public void setAge() 
	{
		this.age = age;
	}
	
	public String getColour(String colour) 
	{
		return colour;
	}
	public void setColour() 
	{
		this.colour = colour;
	}
	
	public IsFemale getIsFemale(IsFemale isFemale) 
	{
		return isFemale;
	}
	public void setIsFemale() 
	{
		this.isFemale = isFemale;
	}
	
	public abstract void getTypeOfAnimal();
	
	public Pet() 
	{
		
	}
	
	public Pet(String name, String breed, int age, String colour) 
	{
		this();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	@Override
	public String toString() 
	{
		return "Pet[Name: " + getName(name) +  ", Breed: " + getBreed(breed) + ", Age: " + getAge(age) +  ", Colour:]";
	}
}
