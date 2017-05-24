import java.util.Arrays;
import java.util.Scanner;

public class Ex4_4 
{
	public static final int arraySize0 = 12;
	
	public static void main(String [] args) 
	{
		Ex4_4 n0 = new Ex4_4();	

		double[] array0 = new double[arraySize0];
		double[] arrayOldPrices = n0.arrayOld(array0);
		
		n0.arrayNew(arrayOldPrices);	
	}
	
	private double[] arrayOld(double[] a0) 
	{
		Scanner sc0 = new Scanner(System.in);	
		
		for(int i = 0; i < arraySize0; i++) 
		{
			System.out.print("Please enter a number: ");
			double num = sc0.nextDouble();
			
			a0[i] = num;
		}
		
		System.out.println("The array entered is: ");
		System.out.println(Arrays.toString(a0));
		
		sc0.close();
		return a0;
	}
	
	private void arrayNew(double[] b0) 
	{	
		for(int i = 0; i < arraySize0; i++) 
		{	
			double payrise = b0[i] * 0.04;
			double num4Percent = b0[i] + payrise;
			b0[i] = num4Percent;
		}
		
		System.out.println(Arrays.toString(b0));
	}
}