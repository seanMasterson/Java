public class Ex4_9 
{
	public static void main(String [] args) 
	{
		String[][] composerNames = {{"Unsuk Chin"}, {"Benjamin Britten"}, 
									{"Tristan Murail"}, {"Toru Takemitsu"}, 
									{"J.S. Bach"}, {"William Byrd"}, 
									{"Claudio Monteverdi"}, {"Thomas Ades"}, 
									{"Sean Doherty"}, {"Kaija Saariaho"},
									{"Hildegard Von Bingen"}, {"Amanda Feery"}};
		
		System.out.println("***COMPOSER NAMES***\n");
		
		for(int i = 0; i < composerNames.length; i++) 
		{
			for(int j = 0; j < composerNames[i].length ; j++) 
			{
				System.out.println(composerNames[i][j]);
			}
		}
	}
}