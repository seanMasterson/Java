import java.time.LocalDate;

public class Ex11_1 
{
	public static void main(String[] args) 
	{
		Boss b0 = new Boss("Death Spell","Omega", LocalDate.parse("1992-10-05"), 13.49);
		CommissionWorker c0 = new CommissionWorker("Le Vie est Prelude","Le Mort Orgasme", LocalDate.parse("1995-06-20"), 30.55, 12.56, 5);
		HourlyWorker h0 = new HourlyWorker("Luc","Lemay", LocalDate.parse("1876-08-11"), 134.70, 4);
		PieceWorker p0 = new PieceWorker("Scott","Clendenin", LocalDate.parse("1990-12-15"), 3, 4.6);
		
		Employee[] employees = {b0, c0, h0, p0};
		
		for(Employee e : employees) 
		{
			System.out.println(e.toString());
			System.out.println();
		}
	}
}
