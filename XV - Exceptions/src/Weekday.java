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
		for(int i = 0; i < week.length; i++) 
		{
			if(week[i] == weekday)
				this.weekday = weekday;
			else
				throw new InvalidWeekdayException("Not a valid day.");
		}	
	}

	public Weekday() 
	{
		
	}
	
	public Weekday(String weekday) 
	{
		try 
		{
			setWeekday(weekday);
		}
		catch(InvalidWeekdayException  w) 
		{
			
		}
	}
	
	@Override
	public String toString() 
	{
		return "Day of the Week [Weekday : " + weekday + "]";
	}
}
