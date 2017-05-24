import java.util.Scanner;

public class Ex3_5 
{
	public static void main(String [] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int count = 0;
		
		while(count < 3) 
		{
			System.out.println("Enter an integer: ");
			int a = input.nextInt();
			total += a;
			count++;
		}
		
		System.out.print("The total sum of the numbers equals: " + total);
		
		input.close();
	}
}