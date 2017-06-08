public class Weekday 
{
	private String weekday;
	private String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	
	public String getWeekday() 
	{
		return weekday;
	}
	public void setWeekday(String weekday) throws InvalidWeekdayException
	{
		this.weekday = weekday;
		throw new InvalidWeekdayException("Not a valid day.");
	}

	public Weekday() 
	{
		
	}
	
	public Weekday(String weekday) throws InvalidWeekdayException
	{
			setWeekday(weekday);
	}
	
	@Override
	public String toString() 
	{
		return "Day of the Week [Weekday : " + weekday + "]";
	}
}
