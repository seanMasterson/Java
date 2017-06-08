public class Ex15_3 
{
	public static void main(String[] args) 
	{
		try 
		{
			Weekday w0 = new Weekday("Monday");
			System.out.println(w0.toString());
			
			Weekday w1 = new Weekday("kjghlfvjhsfv");
			System.out.println(w1.toString());
			
		}
		catch (InvalidWeekdayException w) 
		{
			System.out.println(w.getMessage());
			w.printStackTrace();
		}
	}
}
