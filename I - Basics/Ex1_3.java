import javax.swing.JOptionPane;

public class Ex1_3 
{
	public static void main(String [] args) 
	{
		double salary = 28_000;
		System.out.println("Salary:\t" + salary);
		
		double salMonth = salary / 12;
		System.out.printf("Monthly salary: %.2f \n", salMonth);
		
		double salWeek = salary / 52;
		System.out.printf("Weekly salary: %.2f \n", salWeek);
		
		double salFiveYears = salary * 5;
		System.out.println("Salary in Five Years: " + salFiveYears);
		
		double percentGap = salary * 0.8;
		double newCap = salary - percentGap;
		double newSal = salary + newCap;
		System.out.println("Salary after 8% rise in pay: " + newSal);
		
		JOptionPane.showMessageDialog(null, String.format("Your new super - serial salary is: %.2f", newSal));
	}
}
