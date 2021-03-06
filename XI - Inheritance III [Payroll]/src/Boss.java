import java.time.LocalDate;

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
	
	public Boss(String firstName, String lastName, LocalDate dob, double salary) 
	{
		super(firstName, lastName, dob);
		setSalary(salary);
	}
	
	@Override
	public String toString()
	{
		return "Boss: [" +   super.toString() + ", Salary: " + String.format("%.2f", getEarnings()) + "]";
	}
}
