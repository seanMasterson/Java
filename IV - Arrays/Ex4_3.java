import java.util.Arrays;
import java.util.Scanner;

public class Ex4_3 
{
	public static final int arraySize0 = 8;
	
	public static void main(String [] args) 
	{
		Ex4_3 n0 = new Ex4_3();
		Scanner sc = new Scanner(System.in);
		
		double[] array0 = new double[arraySize0];
		
		System.out.println("***INITIALISE FIRST ARRAY***\n");
		
		for(int i =0; i < arraySize0; i++) 
		{
			System.out.printf("Please enter number [%d]: ", i + 1);
			double num = sc.nextDouble();
			
			array0[i] = num;
		}
		
		double[] array1 = new double[arraySize0];
		
		System.out.println("***INITIALISE SECOND ARRAY***\n");
		
		for(int i = 0; i < arraySize0; i++) 
		{
			System.out.printf("Please enter number [%d]: ", i + 1);
			double num = sc.nextDouble();
			
			array1[i] = num;
		}
		
		n0.addArrays(array0, array1);
		
		sc.close();
	}
	
	private void addArrays(double[] a1, double[] b1) 
	{
		double[] arraySigma = new double[arraySize0];
		
		for(int i = 0; i < arraySize0; i++) 
		{
			arraySigma[i] = a1[i] + b1[i];
		}
		
		System.out.println("The sum of the arrays is: ");
		System.out.println(Arrays.toString(arraySigma));
	}
}