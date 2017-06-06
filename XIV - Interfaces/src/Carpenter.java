import java.time.LocalDate;

public class Carpenter extends Trainee implements Apprentice 
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
		/*if(phaseNum.equals(Phases.PHASE_ONE))
			this.phase = phase;
		Phases ps = Phases(phase);
		switch (phase) 
		{
			case 1:
				this.phase = Phases.PHASE_ONE;
				break;
			case 2:
				phase = Phases.PHASE_TWO;
				break;
			case 3:
				phase = Phases.PHASE_THREE;
				break;
			case 4:
				phase = Phases.PHASE_ONE;
				break;
			case 5:
				phase = Phases.PHASE_ONE;
				break;
			default:
				break;
		}*/	
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
	
	public Carpenter() 
	{
	
	}
	
	public Carpenter(String name, LocalDate dob, int pps) 
	{
		super(name, dob, pps);
	}
	
	@Override
	public String toString() 
	{
		return super.toString();
	}
}
