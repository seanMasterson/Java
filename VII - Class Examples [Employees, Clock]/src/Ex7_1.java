public class Ex7_1 
{
	public static void main(String[] args) 
	{
		Employee [] employees = new Employee[3];
		
		employees[0] = new Employee();
		employees[0].setName("David Vincent");
		employees[0].setAge(48);
		employees[0].setSalary(23_560);
		employees[0].setSickDays(115);
		employees[0].setEmployeeNum(666_666_666);
		System.out.println(employees[0].toString());
		
		employees[1] = new Employee("June Lee", 24, 45_000, 2, 234564);
		System.out.println(employees[1].toString());
		
		employees[2] = new Employee();
		employees[2].setName("Erwin Schroedinger");
		employees[2].setAge(34);
		employees[2].setSalary(125_000);
		employees[2].setSickDays(6);
		employees[2].setEmployeeNum(1380);
		System.out.println(employees[2].toString());
	}
}
