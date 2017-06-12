import java.util.Scanner;

public class Ex16_7 
{
	public static void main(String[] args) 
	{
		Scanner sc0 = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter your first word: ");
		String word1 = sc0.nextLine();
		
		System.out.println("Enter your second word: ");
		String word2 = sc1.nextLine();
		
		if(word1.compareTo(word2) > 0) 
		{
			System.out.printf("%s precedes %s.\n", word2, word1);
		}
		else
		{
			System.out.printf("%s precedes %s.\n", word1, word2);
		}
		
		sc0.close();
		sc1.close();
	}
}
