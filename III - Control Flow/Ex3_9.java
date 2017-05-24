import java.util.Scanner;

public class Ex3_9 
{
	public static void main(String [] args) 
	{
		Ex3_9 n0 = new Ex3_9();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		float num1 = sc.nextFloat();
		
		System.out.println("Enter second number: ");	
		float num2 = sc.nextFloat();
	
		System.out.println("Enter third number: ");
		float num3 = sc.nextFloat();
			
		n0.compare(num1, num2, num3);
		n0.largestSmallest(num1, num2, num3);
		float avgFloats = n0.average(num1, num2, num3);
		System.out.printf("The average of the entered numbers = %.2f.\n", avgFloats);	
		
		sc.close();
	}
	
	private void compare(float x, float y, float z) 
	{
		if((x == y && x != z) || (x == y && y != z)) 
			System.out.println("Numbers 1 and 2 are equal.\n");
		else if((x == z && x != y) || (x == z && y != z)) 
			System.out.println("Numbers 1 and 3 are equal.\n");
		else if((x != y && y == z) || (x != z && y == z)) 
			System.out.println("Numbers 2 and 3 are equal.\n");			
		else if(x == y && x == z) 
			System.out.println("All of the numbers are equal.\n");
		else 
			System.out.println("All of the numbers are different.\n");
	}
	
	private void largestSmallest(float x, float y, float z) 
	{
		if(x > y && x > z) 
			System.out.println(x + " is greatest.\n");
		else if(y > x && y > z) 
			System.out.println(y + " is greatest.\n");
		else 
			System.out.println(z + " is greatest.\n");
		
		if(x < y && x < z)
			System.out.println(x + " is smallest.\n");
		else if(y < x && y < z) 
			System.out.println(y + " is smallest.\n");
		else 
			System.out.println(z + " is smallest.\n");
		
		if((x == y && x != z) || (x == y && y != z)) 
			System.out.println("Numbers 1 and 2 are the smallest.\n");
		else if((x == z && x != y) || (x == z && y != z)) 
			System.out.println("Numbers 1 and 3 are the smallest.\n");
		else if((x != y && y == z) || (x != z && y == z)) 
			System.out.println("Numbers 2 and 3 are the smallest.\n");		
	}
	
	private float average(float x, float y, float z) 
	{
		float avg = (x + y + z)/ 3;
		return avg;
	}
}