import java.time.LocalDate;

public class Trainee 
{
	private String name;
	private LocalDate dob;
	private int pps;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public LocalDate getDob() 
	{
		return dob;
	}
	public void setDob(LocalDate dob) 
	{
		this.dob = dob;
	}
	
	public int getPps() 
	{
		return pps;
	}
	public void setPps(int pps) 
	{
		this.pps = pps;
	}
	
	public Trainee() 
	{

	}
	
	public Trainee(String name, LocalDate dob, int pps) 
	{
		this();
		this.name = name;
		this.dob = dob;
		this.pps = pps;
	}
	@Override
	public String toString() 
	{
		return "Trainee [Name : " + name + ", Date Of Birth : " + dob + ", PPS Number : " + pps + "]";
	}
}
