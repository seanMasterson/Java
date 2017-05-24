import java.util.Scanner;

public class Ex3_7 
{
	public static void main(String [] args) 
	{		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int count = 0;
		boolean switchOff = true;

		while(switchOff) 
		{
			System.out.print("Enter an integer: ");
			int a = sc.nextInt();
			
			if(a == -1) 
			{
				switchOff = false;
			}
			else 
			{
				total += a;	
				count++;
			}									
		}
		
		System.out.print("The total sum of the numbers equals: " + total);
		System.out.println(" ");
		
		double avg = (double)total / count;
		System.out.printf("The average of the numbers entered is: %.2f", avg);
		
		sc.close();
	}
}