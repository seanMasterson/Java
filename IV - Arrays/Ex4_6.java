import java.util.Scanner;
import java.util.Arrays;

public class Ex4_6
{
	public static final int numOfExams = 3;

	public static void main(String[] args) 
	{
		Ex4_6 n0 = new Ex4_6();
		
		System.out.println("\t***FIRST SET OF RESULTS***\n");
		int[] resultSet1 = new int[numOfExams];
		int[] examResult1 = inputResult(resultSet1);
			
		System.out.println("\t***SECOND SET OF RESULTS***\n");	
		int[] resultSet2 = new int[numOfExams];
		int[] examResult2 = inputResult(resultSet2);
		
		System.out.println("\t***THIRD SET OF RESULTS***\n");
		int[] resultSet3 = new int[numOfExams];
		int[] examResult3 = inputResult(resultSet3);
		
    	n0.calculateResult(examResult1);
		n0.calculateResult(examResult2);
		n0.calculateResult(examResult3);
	}
	
	private static int[] inputResult(int[] examResults) 
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < examResults.length; i++) 
		{
			System.out.printf("Please enter exam grade [%d] : ", i + 1);
			int mark = sc.nextInt();
			examResults[i] = mark;
    	}
		
		System.out.println("The array of collected exam marks is: ");
		System.out.println(Arrays.toString(examResults) + "\n");
		
		sc.reset();
		return examResults;
	}
	
	private void calculateResult(int[] examResults) 
	{
    	int sum = 0;
		int average;
		
		for(int i = 0; i < examResults.length; i++) 
			sum += examResults[i];
		
		average = sum / examResults.length;
		
		if(average >= 40) 	
			System.out.println("Result :\t" + Arrays.toString(examResults) + "\t" + "Pass");	
		else
			System.out.println("Result :\t" + Arrays.toString(examResults) + "\t" + "Fail");
	}	
}