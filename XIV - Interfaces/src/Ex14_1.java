import java.time.LocalDate;

public class Ex14_1 
{
	public static void main(String[] args) 
	{
		Trainee[] trainees = {new ComputerAidedDesign("Ferdia Mooney", LocalDate.parse("1984-11-30"), 654563),
							  new Software_Developer("Danielle Jacobson", LocalDate.parse("1993-07-12"), 12334),
							  new Carpenter("Oja Alufemi", LocalDate.parse("1958-09-25"), 267534, 4, "Joe Dart"),
							  new Electrician("Salma Khan", LocalDate.parse("1979-04-08"), 98652, 2, "Michelle Hynes"),
							  new Carpenter("David Byrne", LocalDate.parse("1992-07-02"), 543, 2, "Laura Moloney")};
		
		for(Trainee t : trainees) 
		{
			System.out.println(t);
			if(t instanceof Apprentice) 
			{
				if(((Apprentice) t).getPhases() == Apprentice.PHASE_TWO)
					System.out.println("Name: " + t.getName() + ", Employer's Name: " + ((Apprentice) t).getEmployersName());
			}	
		}
	}
}
