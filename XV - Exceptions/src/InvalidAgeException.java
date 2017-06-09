public class InvalidAgeException extends Exception
{
	private static final long serialVersionUID = 15L;
	
	public InvalidAgeException() 
	{
		
	}
	
	public InvalidAgeException(String message) 
	{
		super(message);
	}
}
