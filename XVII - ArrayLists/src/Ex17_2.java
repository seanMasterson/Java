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
		Trainee t2 = new Trainee("Werner Petrozza", "Kassel", LocalDate.of(1967, 10, 13));
		Trainee t3 = new Trainee("Harry Benton", "Tampa, Florida", LocalDate.of(1997, 5, 9));
		Trainee t4 = new Trainee("Marge Simpson", "Springfield, ?", LocalDate.of(1989, 11, 25));
		
		ArrayList<Trainee> trainees = new ArrayList<Trainee>();
		trainees.add(t0);
		trainees.add(t2);
		trainees.add(t3);
		trainees.add(t4);
		
		System.out.println(trainees.contains(tCopy) + "\n");
		
		t2.setAddress("San Fierro, San Andreas");
		System.out.println(t2 + "\n");
		
		System.out.println(trainees + "\n");
		
		System.out.print("Enter a name: ");
		String name = sc.nextLine();
		
		for(Trainee t : trainees) 
		{
			if(name.equals(t.getName())) 
				System.out.println( "In Here: " + t.getName() + "\n");	
		}
		if(!(name.equals(trainees.get(0).getName())) && 
				!(name.equals(trainees.get(1).getName())) && 
				!(name.equals(trainees.get(2).getName())) && 
				!(name.equals(trainees.get(3).getName()))) 
		{
			System.out.println("No Joe\n");
		}
		
		trainees.remove(t2);

		for(Trainee t : trainees) 
		{
			System.out.println(t + "\n");
			
		}
		
		sc.close();
	}
}
