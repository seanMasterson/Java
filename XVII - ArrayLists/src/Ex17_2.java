import java.time.LocalDate;
import java.util.ArrayList;

public class Ex17_2 
{
	public static void main(String[] args) 
	{
		Trainee t0 = new Trainee("Patrick Heaney", "Delgany, Co. Wicklow", LocalDate.of(1962, 2, 8));
		Trainee t1 = new Trainee("Patrick Heaney", "Delgany, Co. Wicklow", LocalDate.of(1962, 2, 8)); // Do not add to the ArrayList.
		Trainee t2 = new Trainee("Mille Petrozza", "Kassel", LocalDate.of(1967, 10, 13));
		Trainee t3 = new Trainee("Glen Benton","Tampa, Florida", LocalDate.of(1997, 5, 9));
		
		ArrayList<Trainee> trainees = new ArrayList<Trainee>();
		trainees.add(t0);
		trainees.add(t2);
		trainees.add(t3);
		
	}
}