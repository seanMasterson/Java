import java.time.LocalDate;

public class Trainee 
{
	private String name;
	private String address;
	private LocalDate birthday;
	
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
	
	public LocalDate getBirthday() 
	{
		return birthday;
	}
	public void setBirthday(LocalDate birthday) 
	{
		this.birthday = birthday;
	}
	
	public Trainee() 
	{
		super();
	}
	
	public Trainee(String name, String address, LocalDate birthday) 
	{
		super();
		this.name = name;
		this.address = address;
		this.birthday = birthday;
	}
	
	@Override
	public String toString() 
	{
		return "Trainee [Name : " + name + ", Address : " + address + ", Birthday : " + birthday + "]";
	}
	
	
}
