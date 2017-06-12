import java.util.Scanner;
// Have a look back at this one...
public class Ex16_6 
{
	public static void main(String[] args) 
	{
		System.out.println("***WELCOME TO THE GOJIRA GUESSING GAME COME MY FIENDS***");
		Scanner sc0 = new Scanner(System.in);
		
		String[] myWords = {"serpent", "spine", "phoenix", "firebird"};

		int incorrectGuessCounter = 0;
		
		int randomNumber = (int)(Math.random()*4);
		String word = myWords[randomNumber];

		while(incorrectGuessCounter < 8) 
		{
			for (int i = 0; i < word.length(); i++) 
			{
				System.out.print("A " + word.length() + "-letter word has been picked at random. Please guess a letter: ");
						
				char guess = sc0.next().charAt(0);
				
				if (word.charAt(i) == guess) 
				{
					System.out.print(guess + " was found at position [" + i + "].\n");
				} 
				else 
				{
					incorrectGuessCounter++;
				} 
			}	
		}
			
		System.out.println("***PROGRAM TERMINATED***");
		sc0.close();
	}
}
