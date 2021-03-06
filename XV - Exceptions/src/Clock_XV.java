public class Clock_XV extends InvalidTimeException
{	
	private static final long serialVersionUID = 15L;
	
	private int hours;
	private int minutes;
	private int seconds;
	
	public int getHours() 
	{
		return hours;
	}
	public void setHours(int hours)
	{
		if(hours < 24)
			this.hours = hours;
		else
		{
			this.hours = hours % 24;
		}
	}
	
	public int getMinutes() 
	{
		return minutes;
	}
	public void setMinutes(int minutes)
	{
		if(minutes < 60)
			this.minutes = minutes;
		else 
		{
			this.minutes = minutes % 60;
		}
	}
	
	public int getSeconds() 
	{
		return seconds;
	}
	public void setSeconds(int seconds)
	{
		if(seconds < 60)
			this.seconds = seconds;
		else 
		{
			int timeRemainder = seconds % 60;
			this.seconds = timeRemainder;
		}
	}
	
	public void resetTime() 
	{
		hours = 0;
		minutes = 0;
		seconds = 0;
	}
	
	public int incrementHours(int incHours) 
	{
		hours += incHours;
		setHours(hours);
		return hours;
	}
	
	public int incrementMinutes(int incMinutes) 
	{
		minutes += incMinutes;
		setMinutes(minutes);
		
		return minutes;
	}
	
	public int incrementSeconds(int incSeconds)
	{
		seconds += incSeconds;
		setSeconds(seconds);
		return seconds;
	}
	
	public Clock_XV() 
	{
		
	}
	
	public Clock_XV(int hours, int minutes, int seconds) throws InvalidTimeException
	{	
		if((hours >= 0 && hours < 24) && (minutes >= 0 && minutes < 60) && (seconds >= 0 && seconds < 60)) 
		{	
			this.hours = hours;
			this.minutes = minutes;
			this.seconds = seconds;
		}
		else
			throw new InvalidTimeException("That�s definitely not a correct time.");
	}
	
	@Override
	public String toString() 
	{
		return String.format("Time: %02d:%02d:%02d", hours, minutes, seconds);
	}
}