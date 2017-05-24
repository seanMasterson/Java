public class Ex4_11
{
	public static void main(String[] args) 
	{		
		int[] timeHours = new int[12];
		int[] timeMinutes = new int[60];
		int[] timeSeconds = new int[60];
		
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		
		for(int i = 0; i < timeHours.length; i++)
		{		
			timeHours[i] = hours;
			hours++;
		}
		
		for(int i = 0; i < timeMinutes.length; i++)
		{		
			timeMinutes[i] = minutes;
			minutes++;
		}
		
		for(int j = 0; j < timeSeconds.length; j++)
		{			
			timeSeconds[j] = seconds;
			seconds++;
		}
		
		for(int i: timeHours)
		{
			for(int a : timeMinutes) 
			{		
				for(int b : timeSeconds) 
				{
					if(i < 10 && a < 10 &  b < 10)
						System.out.printf("0%d : 0%d : 0%d\n", i, a, b);
					else if(i < 10 && a < 10 &  b >= 10)
						System.out.printf("0%d : 0%d : %d\n", i, a, b);
					else if(i < 10 && a >= 10 && b >= 10)
						System.out.printf("0%d : %d : %d\n", i, a, b);
					else if(i < 10 && a >= 10 &  b < 10)
						System.out.printf("0%d : %d : 0%d\n", i, a, b);
					else if(i >= 10 && a < 10 && b < 10)
						System.out.printf("%d : 0%d : 0%d\n", i, a, b);
					else if(i >= 10 && a >= 10 && b < 10)
						System.out.printf("%d : %d : 0%d\n", i, a, b);
					else if(i >= 10 && a < 10 && b >= 10)
						System.out.printf("%d : 0%d : %d\n", i, a, b);
					else
						System.out.printf("%d : %d : %d\n", i, a, b);
				}
			}
		}
	}
}


  					