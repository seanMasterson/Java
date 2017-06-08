public class Ex15_3 
{
	public static void main(String[] args) 
	{
		try 
		{
			Weekday w0 = new Weekday("Tuesday");
			Weekday w1 = new Weekday("Some day");
			System.out.println(w0.toString());
			System.out.println(w1.toString());
		}
		catch (InvalidWeekdayException w) 
		{
			w.getMessage();
			w.printStackTrace();
		}
	}
}
