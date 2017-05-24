
public class Ex4_12 
{	
	public static void main(String[] args) 
	{
		String[] months =  {"January","February","March","April",
						    "May","June","July","August",
						    "September","October","November","December"}; 
		
		String[] headings =  {"M","T","W","T","F","S","S"}; 
				 			  
		int[] beginningDates = {6,2,2,5,0,3,5,1,4,6,2,4};
		int blankSpaces = beginningDates[0];
								
		int[][] daysInMonths = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, //January
								 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
								{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, //February
							     16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28},
								{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, //March
							     16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
								{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, //April
								 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
								{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, //May
								 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
								{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, //June
								 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
								{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, //July
								 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
								{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, //August
								 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
								{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, //September
								 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
								{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, //October
								 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
								{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, //November
								 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
								{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, //December
								 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}};			
		 
		for(int i = 0; i < daysInMonths.length; i++)
		{
			System.out.println(months[i]);
			System.out.println();
			
			for(int a = 0; a < headings.length; a++) 
			{
				System.out.print(headings[a] + "\t");
			}
			
			System.out.println();
			
			blankSpaces = beginningDates[i];
			
			for(int b = 0; b < blankSpaces; b++)
			{    
				System.out.print(" \t");
			}
			
			for(int c = 0; c < daysInMonths[i].length; c++) 
			{			
				if((c + blankSpaces) % 7 == 0)	
					System.out.println();
						
				System.out.print(daysInMonths[i][c] + "\t");	
			}
			
			System.out.println("\n");
		}
	}
}
