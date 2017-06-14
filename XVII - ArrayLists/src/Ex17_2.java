import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex17_2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Trainee t0 = new Trainee("Patrick Heaney", "Delgany, Co. Wicklow", LocalDate.of(1962, 2, 8));
		Trainee tCopy = new Trainee("Patrick Heaney", "Delgany, Co. Wicklow", LocalDate.of(1962, 2, 8)); // Do not add to the ArrayList.
		Trainee t2 = new Trainee("Mille Petrozza", "Kassel", LocalDate.of(1967, 10, 13));
		Trainee t3 = new Trainee("Glen Benton","Tampa, Florida", LocalDate.of(1997, 5, 9));
		
		ArrayList<Trainee> trainees = new ArrayList<Trainee>();
		trainees.add(t0);
		trainees.add(t2);
		trainees.add(t3);
		
		System.out.println(trainees.contains(tCopy));
		
		t2.setAddress("San Fierro, San Andreas");
		System.out.println(t2 + "\n");
		
		System.out.println("Enter a name: ");
		String name = sc.nextLine();
		
		for(int i = 0; i < trainees.size(); i++) 
		{
			if() 
			{
				
			}
		}
		
		trainees.remove(t3);
		
		for(Trainee t : trainees) 
		{
			System.out.println(t);
		}
	}
}
