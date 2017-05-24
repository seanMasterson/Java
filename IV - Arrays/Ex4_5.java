public class Ex4_5
{
	public static void main(String [] args) 
	{
		String[] arrayFirstNames = {"Sean ", "Asen ", "Vitalie ", "Luca ", "Emmanuel ", 
									"Stephen ", "Pat ", "Gabriella ", "Agnes ", "James ", 
									"Jay ", "Darius ", "Shane ", "Damien ", "Ben "};
									
		String[] arrayLastNames = {"Masterson", "Bach", "Bartok", "Stravinsky", "Mendelsohn", 
							       "Ligeti", "Britten", "Handel", "Lutoslawski", "Corigliano", 
								   "Glass", "Reich", "Harrison", "Cage", "Rautavaara"};
								   
		System.out.println("***First Names ***");
		
		for(int i = 0; i < arrayFirstNames.length; i++) 
		{
			System.out.println(arrayFirstNames[i] + "\n");
		}
		
		System.out.println("***Last Names***");
		
		for(int i = 0; i < arrayLastNames.length; i++) 
		{
			System.out.println(arrayLastNames[i] + "\n");
		}
		
		System.out.println("***Full Names***");
		
		String[] arrayFullNames = new String[15];
		
		for(int i = 0; i < arrayFullNames.length; i++) 
		{
			arrayFullNames[i] = arrayFirstNames[i] + arrayLastNames[i];
			System.out.println(arrayFullNames[i] + "\n");
		}
	}
}