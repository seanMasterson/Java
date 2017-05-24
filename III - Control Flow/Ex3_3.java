public class Ex3_3 
{
	public static void main(String [] args) 
	{
		int numOfLives = 8;
		
		do  
		{
			System.out.printf("Lives remaining: %d \n", numOfLives);
			numOfLives--;			
		}while(numOfLives >= 0);
		 
		System.out.println("***REBORN***\n");
		
		for(numOfLives = 8; numOfLives >= 0; numOfLives--) 
		{
			System.out.printf("Lives remaining: %d \n", numOfLives);
		}
		
		System.out.println("***YOU'RE DEAD***");
	}
}