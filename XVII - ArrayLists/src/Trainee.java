import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Trainee 
{
	private String name;
	private String address;
	private LocalDate birthday;
	private static int traineeCounter;
	private int count = 1;
	
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
	
	@Override
	public boolean equals(Object obj) 
	{
		Trainee t = (Trainee)obj;
		
		if(this.name.equals(t.name) && this.address.equals(t.address) && this.birthday.equals(t.birthday))
			return true;
		if(obj == null)
			return false;
		else
			return false;
	}
	
	public Trainee() 
	{
		count = traineeCounter++;
	}
	
	public Trainee(String name, String address, LocalDate birthday) 
	{
		this();
		this.name = name;
		this.address = address;
		this.birthday = birthday;
	}
	
	@Override
	public String toString() 
	{
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return "Trainee #" + count + " [Name : " + getName() + ", Address : " + getAddress() + ", Birthday : " + getBirthday().format(dateFormat) + "]";
	}
}
