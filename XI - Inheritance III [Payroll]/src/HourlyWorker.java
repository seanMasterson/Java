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
		return 0;
	}
	
	public HourlyWorker() 
	{
		
	}
	
	public HourlyWorker(String firstName, String lastName, double wage, int hoursWorked) 
	{
		
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}
}

