import java.util.Scanner;

public class Ex2_10 
{
	public static void main(String [] args) 
	{
		Ex2_10 n0 = new Ex2_10();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your first number: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Please enter your second number: ");
		double num2 = sc.nextDouble();
		
		System.out.print("Please enter your third and final number: ");
		double num3 = sc.nextDouble();
		
		double answer = n0.getTotal(num1, num2, num3);
		System.out.printf("The sum of all numbers entered amounts to %.2f", answer);
		
		sc.close();
	}
	
	public double getTotal(double x, double y, double z) 
	{
		double result = x + y + z;
		return result;
	}
}