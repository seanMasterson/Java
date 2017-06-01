public class Owner 
{
	private String name;
	private String address;
	private String phoneNumber;
	private Pet[] pets;
	private static int ownerCount = 1;
	private int count;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public String getPhoneNumber() 
	{
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}
	
	public Pet[] getPets() 
	{
		return pets;
	}
	
	public void setPets(Pet[] pets) 
	{
		this.pets = pets;
	}
	
	public Owner() //no-args constructor  
	{
		count = ownerCount++;
	}
	
	public Owner(String name, String address, String phoneNumber, Pet[] pets) 
	{
		this();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		setPets(pets);
	}
	
	@Override
	public String toString() 
	{
		return String.format("Owner #%d", count) + " [Name: " + 
			   name + ", Address: " + address + ", Phone Number: " + phoneNumber + "]";
	}
}
