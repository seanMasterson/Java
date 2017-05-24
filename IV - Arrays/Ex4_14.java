import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Ex4_14 

{
	public static final int arraySize = 50;
	
	public static void main(String[] args) 
	{
		Ex4_14 n0 = new Ex4_14();
		Scanner sc = new Scanner(System.in);
		
		int[] a0 = new int[arraySize];
		
		n0.printArray(a0);
		n0.findSmallestElement(a0);
		n0.findLargestElement(a0);
		
		System.out.print("Please enter a number of your choice: ");
		int placeholder = sc.nextInt();
		n0.searchArray(a0, placeholder);
		n0.sortArray(a0);
		
		sc.close();
	}
	
	private void findSmallestElement(int[] a0) 
	{
		int s = a0[0];
		int positionFound = 0;
		for(int i = 1 ; i < a0.length; i++) 
		{
			if(a0[i] < s)
			{
				s = a0[i];
				positionFound = i + 1;
			}
		}
		
		System.out.println("The smallest number in the array is: " + s + " at position " + positionFound);
	}
	
	private void findLargestElement(int[] a0) 
	{
		int l = a0[0];
		int positionFound = 0;
		for(int i = 1 ; i < a0.length; i++) 
		{
			if(a0[i] > l)
			{
				l = a0[i];
				positionFound = i + 1;
			}
		}
		
		System.out.println("The largest number in the array is: " + l + " at position " + positionFound);
		System.out.println();
	}
	
	private void searchArray(int[] a0, int p) 
	{
		boolean isFound = false;
		int position = 0;
		for(int i = 0; i < a0.length; i++)
		{
			if(a0[i] == p) 
			{
				isFound = true;
				position = i + 1;
				System.out.printf("The integer that was selected by the user: [%d] is in the array at position [%d]. \n", p, position);
				System.out.println();
				break;
			}		
		}
		
		if(isFound != true)
			System.out.println("The integer could not be found." + "\n");
		
	}
	
	private void sortArray(int[] a0) 
	{
		int[] dummyArray = new int[arraySize];
		
		Arrays.sort(a0);
		
		for(int i = 0; i < a0.length; i++)
			dummyArray[i] = a0[i];
		
		System.out.println("The sorted array is : ");
		System.out.print(Arrays.toString(dummyArray));
	} 
	
	private void printArray(int[] a0) 
	{
		/* Creates an instance of the Random class */
		Random random = new Random();
			
		/*
	    * random.nextInt(100) will return a random number 
	    * between 0 (inclusive) and 100 (exclusive).
	    * + 1 will mean the number is between 1 and 100.
	    */
		int n0 = random.nextInt(100) + 1;
		 
		for(int i = 0; i < a0.length; i++) 
		{
			a0[i] = n0;
			n0 = random.nextInt(100) + 1;
		}

		System.out.println("The array populated with random values is: " + "\n" + Arrays.toString(a0));
		System.out.println();
	} 
}
