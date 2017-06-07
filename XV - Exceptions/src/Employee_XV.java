public class Employee_XV extends InvalidAgeException
{
	private String name;
	private int age;
	private double salary;
	private int sickDays;
	private int employeeNum;
	
	public static int numEmployees;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) throws InvalidAgeException
	{
		if(age >= 16 && age <= 70)
			this.age = age;
		else
			throw new InvalidAgeException("Age exception caught! Someone is " + age + " years old.");
	}
	
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public int getSickDays() 
	{
		return sickDays;
	}
	public void setSickDays(int sickDays) 
	{
		this.sickDays = sickDays;
	}
	
	public int getEmployeeNum() 
	{
		return employeeNum;
	}
	public void setEmployeeNum(int employeeNum) 
	{
		this.employeeNum = employeeNum;
	}
	
	public String printSickDays(int sickDays) 
	{
		if(sickDays > 14)
			return String.format("This employee has taken too many sick days.\n");
		else
			return String.format("This employee has taken %s sick days.\n", sickDays);
	}
	
	public double increaseSalary(double salary) 
	{
		double newSal = salary + (salary * 0.4d);
		return newSal;
	}
	
	public String verifyEmployeeNumber(int employeeNum) 
	{
		if(Integer.toString(employeeNum).length() > 7)
			return "That is not an invalid employee number.";
		else
			return Integer.toString(employeeNum);
	}
	
	public Employee_XV() 
	{
		numEmployees++;
	}
	
	public Employee_XV(String name, int age, double salary, int sickDays, int employeeNum) 
	{
		this();
		this.name = name;
		try 
		{
			setAge(age);
		}
		catch(InvalidAgeException e)
		{
			
		}
		setSalary(salary);
		increaseSalary(salary);
		setSickDays(sickDays);
		setEmployeeNum(employeeNum);
	}
	
	@Override
	public String toString() 
	{
		return "Employee : [" + numEmployees + "]" + "\n"
				+ "Name: " + getName() + "\n"
				+ "Age: " + getAge() + "\n" 
				+ "Salary: " + getSalary() + "\n"
				+ "New Salary: " + increaseSalary(salary) + "\n"
				+ String.format("Sick Days: %s", printSickDays(sickDays))
				+ String.format("Employee Number: %s", verifyEmployeeNumber(employeeNum)) + "\n";
	}
}