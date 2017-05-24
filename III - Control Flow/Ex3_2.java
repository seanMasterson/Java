public class Ex3_2 
{
	public static void main(String [] args) 
	{
		int counter = 100;
		
		//(a)
		System.out.println(" ****WHILE LOOP***");
		
		while(counter < 201) 
		{
			System.out.println("Current count: " + counter);
			counter += 2;
		}
		
		System.out.println(" ");
		
		//(b)
		System.out.println(" ****FOR LOOP***");
		
		for(int i = 100; i <= 200 ; i += 2) 
		{
			System.out.println("Current count: " + i);
		}
		
		System.out.println(" ");
		System.out.println("***Program Terminated.***");
	}
}