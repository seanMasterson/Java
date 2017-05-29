public class Ex11_1 
{
	public static void main(String[] args) 
	{
		Boss b0 = new Boss("Death Spell","Omega", 13.49);
		CommissionWorker c0 = new CommissionWorker("Le Vie est Prelude","Le Mort Orgasme", 30.55, 12.56, 5);
		HourlyWorker h0 = new HourlyWorker("Luc","Lemay", 134.70, 4);
		PieceWorker p0 = new PieceWorker("Scott","Clendenin", 3, 4.6);
		
		Employee[] employees = {b0, c0, h0, p0};
		
		for(Employee e : employees) 
		{
			System.out.println(e.toString());
			System.out.println();
		}
	}
}
