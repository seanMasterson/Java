public class Ex5_2 
{
	public static void main(String[] args) 
	{
		Dog d0 = new Dog("Retriever", "Dark Brown", "Mark Hamill");
		//d0.printResults();
		
		Dog d1 = new Dog();
		d1.setColour("Gris Souris");
		d1.setNameOwner("Chuck Schuldiner");
		//d1.printResults();
		
		Dog d2 = new Dog();
		d2.setBreed("Alsation");
		d2.setNameOwner("John White");
		//d2.printResults();
		
		Dog[] dogs = {d0, d1, d2};
		
		for(Dog d : dogs)
		{
			d.printResults();
		}
	}
}

class Dog 
{
	public Dog() 
	{
		
	}
	
	public Dog(String breedDog, String colourDog, String ownerName ) 
	{
		breed = breedDog;
		colour = colourDog;
		nameOwner = ownerName;
	}
	
	private String breed;
	private String colour;
	private String nameOwner;
	
	public String getBreed() 
	{
		return breed;
	}
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	
	public String getColour() 
	{	
		return colour;
	}
	public void setColour(String colour) 
	{
		this.colour = colour;
	}
	
	public String getNameOwner() 
	{
		return nameOwner;
	}
	public void setNameOwner(String nameOwner) 
	{
		this.nameOwner = nameOwner;
	}
	
	public void printResults() 
	{
		if(breed == null)
			System.out.println("Colour of dog: " + colour + "\nName of Owner: " + nameOwner + "\n");
		else if(colour == null)
			System.out.println("Breed of dog: " + breed + "\nName of Owner: " + nameOwner + "\n");
		else if(nameOwner == null)
			System.out.println("Colour of dog: " + colour + "\nBreed of dog: " + breed + "\n");
		else if(breed == null && colour == null)
			System.out.println("Name of Owner:" + nameOwner + "\n");
		else if(colour == null && nameOwner == null)
			System.out.println("Breed of dog: " + breed + "\n");
		else if(breed == null && nameOwner == null)
			System.out.println("Colour of dog: " + colour + "\n");
		else
			System.out.println("Colour of dog: " + colour + "\nBreed of dog: " + breed + "\nName of Owner: " + nameOwner + "\n");
	}
}
