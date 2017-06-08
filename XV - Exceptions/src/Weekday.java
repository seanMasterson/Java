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
			if(weekday.equals(week[i])) 
			{
				this.weekday = weekday;
				break;
			}		
			else
				throw new InvalidWeekdayException("Not a valid day." + weekday);
		}
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
