import java.util.Scanner;

public class Ex16_6 
{
	public static void main(String[] args) 
	{
		System.out.println("***WELCOME TO THE GOJIRA GUESSING GAME***");
		Scanner sc0 = new Scanner(System.in);
		
		String[] myWords = {"serpent", "spine", "uroboric", "fire"};

		int incorrectGuessCounter = 0;
		
		int randomNumber = (int)(Math.random()*4);
		String word = myWords[randomNumber];
		
		do
		{
			System.out.print("A " + word.length() + "-letter word has been picked at random. Please guess a letter: ");		
			char guess = sc0.next().charAt(0);
			
			int counter = 0;
			
			for(int i = 0; i < word.length(); i++) 
			{
				if(word.charAt(i) == guess)
				{
					System.out.println( guess + " was found at position [" + i + "].\n");
					counter++;
					break;
				}
			}
			if(counter == 0)
			{
				System.out.println("Letter not found.\n");
				incorrectGuessCounter++;
			}	
		} while(incorrectGuessCounter < 8); 
		
		System.out.println("***PROGRAM TERMINATED***");
		sc0.close();
	}
}