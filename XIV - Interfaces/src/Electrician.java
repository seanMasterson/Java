import java.time.LocalDate;

public class Electrician extends Trainee implements Apprentice
{
	private int phase;
	private String employersName;
	
	@Override
	public int getPhases() 
	{
		return phase;
	}
	
	@Override
	public void setPhases(int phase) 
	{
		switch (phase) 
		{
			case PHASE_ONE:
			case PHASE_TWO:
			case PHASE_THREE:
			case PHASE_FOUR:
			case PHASE_FIVE:
			case PHASE_SIX:
				this.phase = phase;
				break;
	
			default:
				System.out.println("Not a valid entry. Reset to Phase One.");
				this.phase = PHASE_ONE;
				break;
		}
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
	
	public Electrician(String name, LocalDate dob, int pps, int phase, String employersName) 
	{
		super(name, dob, pps);
		setPhases(phase);
		setEmployersName(employersName);
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + "]";
	}
}
