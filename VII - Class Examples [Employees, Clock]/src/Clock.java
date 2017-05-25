public class Clock 
{	
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
		setHours(minutes);
		
		return minutes;
	}
	
	public int incrementSeconds(int incSeconds)
	{
		seconds += incSeconds;
		setHours(hours);
		
		return seconds;
	}
	
	public Clock(int hours, int minutes, int seconds) 
	{
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	@Override
	public String toString() 
	{
		return String.format("Time: %02d:%02d:%02d", hours, minutes, seconds);
	}
}