public class CommissionWorker extends Employee
{
	private double salary;
	private double commission;
	private int quantity;
	
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

	public double getCommission() 
	{
		return commission;
	}
	public void setCommission(double commission) 
	{
		this.commission = commission;
	}

	public int getQuantity() 
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	@Override
	public double getEarnings() 
	{
		return salary;
	}
	
	public CommissionWorker()
	{
		
	}
	
	public CommissionWorker(String firstName, String lastName, double salary, double commission, int quantity)
	{
		setSalary(salary);
		setCommission(commission);
		setQuantity(quantity);
	}
	
	@Override
	public String toString() 
	{	
		return super.toString();
	}
}
