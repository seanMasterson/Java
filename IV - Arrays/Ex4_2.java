import java.util.Scanner;
import java.util.Arrays;

public class Ex4_2 
{
	public static void main(String [] args) 
	{
		Ex4_2 n0 = new Ex4_2();		
		
		double[] array0 = new double [10];
		
		double sumArray = n0.calculateTotalAndAverage(array0);
		System.out.printf("The average of the numbers placed in your array is: %.2f\n", sumArray);
		
	}
	
	private double calculateTotalAndAverage(double[] array) 
	{
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		
		for(int i = 0; i < array.length; i++) 
		{
			System.out.print("Please enter a number: ");
			double num = sc.nextDouble();
			
			array[i] = num;
			sum += num;
		}
		
		System.out.println("The array entered is: "); 
		System.out.println(Arrays.toString(array));
		System.out.printf("The sum of the entered array is: %.2f\n", sum);
		
		double average = sum / 10;		
		sc.close();
		return average;
	}
}