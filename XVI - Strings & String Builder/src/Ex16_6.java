import java.util.Arrays;
import java.util.Scanner;

public class Ex16_6 
{
	public static void main(String[] args) 
	{
		System.out.println("***WELCOME TO THE GOJIRA GUESSING GAME***");
		
		String[] myWords = {"serpent", "spine", "uroboric", "fire", "gojira"};

		int randomNumber = (int)(Math.random()*5);
		String word = myWords[randomNumber];
		System.out.println(word);
		
		System.out.print("\nA " + word.length() + "-letter word has been picked at random. Please guess a letter: ");
		
		char[] stars = new char[word.length()];
		for(int i = 0; i < stars.length; i++) 
		{
			stars[i] = '*';
		}
		
		try(Scanner sc0 = new Scanner(System.in);) 
		{
			int incorrectGuessCounter = 3;
			
			char[] letters = word.toCharArray();
			
			do
			{
				char guess = sc0.next().charAt(0);

				boolean isFound = false;
				
				for(int i = 0; i < letters.length; i++) 
				{
					if(letters[i] == guess)
					{
						System.out.println(guess + " was found at position [" + (i + 1) + "].\n");
						isFound = true;
						stars[i] = guess;
						System.out.println(stars);
						if(Arrays.equals(stars, letters)) 
						{
							System.out.println("***WIN**");
							System.exit(0);
						}
					}
				}
				
				if(isFound == false)
				{
					System.out.println("Letter not found.");
					incorrectGuessCounter--;
				}
				if(incorrectGuessCounter > 0)
				{
					System.out.printf("%d guesses left.", incorrectGuessCounter);
				}	
				else 
				{
					System.out.println("***PROGRAM TERMINATED***");
				}
				
			} while(incorrectGuessCounter > 0); 	
		}
	}
}