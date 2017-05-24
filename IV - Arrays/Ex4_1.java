import java.util.Arrays;

public class Ex4_1 
{	
	public static void main(String [] args) 
	{
		Ex4_1 n0 = new Ex4_1();
		int[] array1 = new int [10];
		
		int[] arrayFilled = n0.fillArray(array1);
		n0.printArray(arrayFilled);	
	}	
	
	private int[] fillArray(int[] array) 
	{
		for(int i = 0; i < array.length; i++) 
		{
			array[i] = (i + 1) * 2;
		}	
		
		return array;
	}
	
	private void printArray(int[] array) 
	{
		System.out.println(Arrays.toString(array));
		
		// for(int i = 0; i < array.length; i++) 
		// {
			// System.out.println(Arrays.toString(array));
		// }
	}
}