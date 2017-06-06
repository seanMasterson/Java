import java.util.Arrays;

public class ArgsInMain 
{
	public static void main(String[] args) 
	{
		System.out.println(args.length);
		
		System.out.println(args[0]);
		
		for(int i = 0; i <args.length; i++) 
		{
			System.out.printf("Element [%d] of args is : %s", i, args[i]);
		}
	}
}