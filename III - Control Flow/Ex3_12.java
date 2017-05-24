import java.lang.Math;

public class Ex3_12 
{
	public static void main(String [] args) 
	{
		Ex3_12 n0 = new Ex3_12();
			
		n0.calculateDiceScores();
	}	
	
	private void calculateDiceScores() 
	{
		int score0 = (int)(Math.random()*6 + 1);
		System.out.println("First die score: " + score0 + "\n");
		int score1 = (int)(Math.random()*6 + 1);
		System.out.println("Second die score: " + score1 + "\n");
		
		int result;
		
		if(score0 == 6 || score1 == 6) 
		{
			result = score0 + score1;
			
			if(score0 == 6 && score1 == 3) 
				result = (score0 + score1) + 10;
			
			if(score0 == 6 && score1 == 5)	
				result = (score0 + score1) - 4;
		}			
		else if(score0 == 3 || score1 == 3) 
		{
			result = (score0 * score1) + 10;
			
			if(score0 == 3 && score1 == 3)	
				result = (score0 * score1) + 20;
				
			if(score0 == 3 && score1 == 5)	
				result = (score0 * score1) + 6;
			
			if(score0 == 3 && score1 == 6)
				result = (score0 + score1) + 10;
		}
		else if(score0 == 5 || score1 == 5)
		{
			result = (score0 * score1) - 4;
			
			if(score0 == 5 && score1 == 3) 			
				result = (score0 * score1) + 6;	
						
			if(score0 == 5 && score1 == 5)	
				result = (score0 * score1) - 8;
				
			if(score0 == 5 && score1 == 6)
				result = score0 + score1 - 4;
		}
		else 
		{
			result = score0 * score1;			
		}
		
		System.out.println("Die score: " + result);
	}	
}