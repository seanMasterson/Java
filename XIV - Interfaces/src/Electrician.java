import java.time.LocalDate;

public class Electrician extends Trainee implements Apprentice
{
	private int phase;
	private String employersName;
	
	@Override
	public int getPhase() 
	{
		return phase;
	}
	@Override
	public void setPhase(int phase) 
	{
		this.phase = phase;
	}
	
	@Override
	public String getEmployersName() 
	{
		return employersName;
	}
	@Override
	public void setEmployersName(String employersName) 
	{
		this.employersName = employersName;
	}
	
	public Electrician() 
	{

	}
	
	public Electrician(String name, LocalDate dob, int pps) 
	{
		super(name, dob, pps);
	}
	
	@Override
	public String toString() 
	{
		return super.toString();
	}
}
