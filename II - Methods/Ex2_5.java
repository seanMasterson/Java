import java.util.Scanner;

public class Ex2_5 
{
	public static void main(String [] args) 
	{
		Ex2_5 n0 = new Ex2_5();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your yearly salary: ");			
		int yearlySal = sc.nextInt();
		
		double payrise0 = (double)yearlySal * 0.04;
		double payrise1 = (double)yearlySal * 0.06;
		System.out.println("Your current salary stands at: " + yearlySal);
		
		n0.printWeeklySalary(yearlySal);
		n0.printMonthlySalary(yearlySal);
		n0.afterPayRise4(yearlySal, payrise0);
		n0.afterPayRise6(yearlySal, payrise1);
		
		sc.close();
	}
	
	private double printWeeklySalary(int sal) 
	{
		double weekSal = (double)sal / 52;		 
		System.out.printf("Your weekly salary is: %.2f\n", weekSal);
		return weekSal;
	}
	
	private double printMonthlySalary(int sal) 
	{
		double monthSal= (double)sal / 12;
		System.out.printf("Your monthly salary is: %.2f\n", monthSal);
		return monthSal;
	}
	
	private double afterPayRise4(int sal, double percentPay4) 
	{
		double payIncr = (double)sal + percentPay4;
		System.out.printf("Your salary after a 4%% pay rise is: %.2f\n", payIncr);
		return payIncr;		
	}
	
	private double afterPayRise6(int sal, double percentPay6) 
	{
		double payIncr = (double)sal + percentPay6;
		System.out.printf("Your salary after a 6%% pay rise is: %.2f\n", payIncr);
		return payIncr;
	}
}