import java.util.Scanner;

public class Ex16_5 
{
	public static void main(String[] args) 
	{
		Scanner sc0 = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String word = sc0.nextLine();
		
		System.out.println("Enter a search character: ");
		char character = sc0.next().charAt(0); // Check what I did here...
		
		int counter = 0;
		
		for(int i = 0; i < word.length(); i++) 
		{
			if(word.charAt(i) == character)
			{
				System.out.println( character + " was found at position: " + i);
				counter++;
			}
		}
		if(counter == 0)
			System.out.println("Letter not found.");
		
		sc0.close();
	}
}
