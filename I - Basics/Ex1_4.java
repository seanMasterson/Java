public class Ex1_4 
{
	public static void main (String [] args) 
	{
		double num1, num2, num3; 
		
		num1 = 1.25;
		num2 = 2.65;
		num3 = 22.65;
		
		double sum = num1 + num2 + num3; 
		System.out.printf("The sum is:\t%.2f", sum);
		
		double average = (sum) / 3;	
		System.out.println("The average is :\t" + average);
	}
}