import java.util.Scanner;

public class Ex3_11 
{
	public static void main(String [] args) 
	{
		Ex3_11 n0 = new Ex3_11();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first exam mark: ");
		double mark0 = sc.nextDouble();
		
		System.out.print("Enter the second exam mark: ");
		double mark1 = sc.nextDouble();
		
		System.out.print("Enter the third exam mark: ");
		double mark2 = sc.nextDouble();
		
		double avg = n0.gradeAverage(mark0, mark1, mark2);
		System.out.printf("The average grade mark is: %.2f.\n", avg);
		
		n0.assessIndividualMarks(mark0, mark1, mark2); 
		n0.assessOverallGrade(avg, mark0, mark1, mark2);
		
		sc.close();
	}
	
	private double gradeAverage(double x, double y, double z) 
	{
		double average = (x + y + z)/3;
		return average;
	}
	
	private void assessIndividualMarks(double x, double y, double z) 
	{
		if(x >= 40 && y >= 40 && z >= 40) 
		{
			System.out.printf("You have passed all of your exams.\n");
			System.out.printf("You have acheived the Minimum Matriculation Score to pass.\n");
		}
		else if(x < 40 && y >= 40 && z >= 40)
			System.out.printf("You have failed your first exam.\n");
		else if(x < 40 && y < 40 && z >= 40)
			System.out.printf("You have failed your first and second exams.\n");
		else if(x >= 40 && y < 40 && z >= 40)
			System.out.printf("You have failed your second exam.\n");
		else if(x >= 40 && y < 40 && z < 40)
			System.out.printf("You have failed your second and third exams.\n");
		else if(x >= 40 && y >= 40 && z < 40) 
			System.out.printf("You have failed your third exam.\n");
		else
			System.out.printf("You have failed all of your exams.\n");
	}
	
	private void assessOverallGrade(double x, double a, double b, double c) 
	{
		if(x >= 50 || a >= 40 && b >= 40 && c >= 40)
			System.out.printf("You have passed the Year.\n");
		else
			System.out.printf("You have failed the Year.\n");
	}
}