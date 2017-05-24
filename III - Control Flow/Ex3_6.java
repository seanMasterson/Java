import java.util.Scanner;

public class Ex3_6 
{
	public static void main(String [] args) 
	{
		Ex3_6 n0 = new Ex3_6();
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int count = 0;
		
		while(count < 10) 
		{
			System.out.print("Enter an integer: ");
			int a = input.nextInt();			
			System.out.println("You entered: " + a);	
			total += a;
			count++;
		}
		
		System.out.println("The total sum of the numbers equals: \n" + total);
		
		double avg = n0.average(total);
		System.out.printf("The average of the numbers entered is: %.2f", avg);
		
		input.close();
	}
	
	private double average(int tot) 
	{
		double result = tot / 10;
		return result;
	}
}