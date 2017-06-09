import java.util.Scanner;

public class Ex16_5 
{
	public static void main(String[] args) 
	{
		Scanner sc0 = new Scanner(System.in);
		String[] word = new String[1];
		
		System.out.println("Enter a word: ");
		String word0 = sc0.nextLine();
		
		word[0] = word0;
		
		System.out.println("Enter a search character: ");
		char character = sc0.next().charAt(0);
		
		for(String c : word) 
		{
			if(c.equals(character))
				System.out.println( c + " was found at position " + word[character]);
		}
	}
}
