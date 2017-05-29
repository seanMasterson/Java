public class Boss extends Employee
{
	private double salary;
	
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

	@Override
	public double getEarnings() 
	{
		return salary;
	}
	
	public Boss() 
	{
		
	}
	
	public Boss(String firstName, String lastName, double salary) 
	{
		super();
		setSalary(salary);
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}
}
