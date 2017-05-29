public abstract class Employee 
{
	private String firstName;
	private String lastName;
	
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public abstract double getEarnings();
	
	public Employee() 
	{
		
	}
	
	public Employee(String firstName, String lastName) 
	{
		this();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() 
	{
		return "First Name: , " + getFirstName() + "Last Name: " + getLastName();
	}
}
