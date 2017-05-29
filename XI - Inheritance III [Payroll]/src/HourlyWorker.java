import java.time.LocalDate;

public class HourlyWorker extends Employee
{
	private double wage;
	private int hoursWorked;
	
	public double getWage() 
	{
		return wage;
	}
	public void setWage(double wage) 
	{
		this.wage = wage;
	}

	public int getHoursWorked() 
	{
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) 
	{
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double getEarnings()
	{
		return wage;
	}
	
	public HourlyWorker() 
	{
		
	}
	
	public HourlyWorker(String firstName, String lastName, LocalDate dob, double wage, int hoursWorked) 
	{
		super(firstName, lastName, dob);
		setWage(wage);
		setHoursWorked(hoursWorked);
	}
	
	@Override
	public String toString()
	{
		return super.toString() + ", Wage: " + String.format("%.2f", getEarnings()) + ", Hours Worked: " + getHoursWorked();
	}
}

