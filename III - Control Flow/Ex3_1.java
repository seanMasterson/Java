public class Ex3_1 
{
	public static void main(String[]args) 
	{
		int counter = 0;
		
		// (a)
		System.out.println("***WHILE LOOP***");
		while(counter <= 22) 
		{
			System.out.printf("Current count: %d \n", counter);	
			if(counter == 22) 			
				System.out.printf("Current count: %d. \n", counter);	
			
			counter++;
		}
		
		// (b)
		System.out.println("***DO WHILE LOOP***");		 
		counter = 0;
		do 
		{
			System.out.printf("Current count: %d \n", counter);	
			if(counter == 22) 		
				System.out.printf("Current count: %d. \n", counter);				
			
			counter++;
		} while(counter <= 22);
		
		// (c)
		System.out.println("***FOR LOOP***");
		for(int i = 0; i <= 22; i++) 
		{
			System.out.printf("Current count: %d \n", i);	
			if(i == 22) 			
				System.out.printf("Current count: %d. \n", i);									
		}
		
		System.out.println("***Program Terminated.***");
	}
}