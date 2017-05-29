import java.time.LocalDate;

public abstract class Employee 
{
	private String firstName;
	private String lastName;
	private LocalDate dob;
	
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
	
	public LocalDate getDOB() 
	{
		return dob;
	}
	public void setDOB(LocalDate dob) 
	{
		this.dob = dob;
	}
	
	public abstract double getEarnings();
	
	public Employee() 
	{
		
	}
	
	public Employee(String firstName, String lastName, LocalDate dob) 
	{
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}

	@Override
	public String toString() 
	{
		return "First Name: " + getFirstName() + ", Last Name: " + getLastName() + ", Date Of Birth: " + getDOB();
	}
}
