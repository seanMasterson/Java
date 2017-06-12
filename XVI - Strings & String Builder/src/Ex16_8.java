import java.util.Scanner;

public class Ex16_8 
{
	public static void main(String[] args) 
	{
		Scanner sc0 = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String input = sc0.nextLine();
		
		String[] words = input.split(" ");
		
		System.out.println("Words: \t" + words.length);
		System.out.println("Characters (including whitespace): \t" + input.length());
		System.out.println("Characters (excluding whitespace): \t" + input.replace(" ", "").length()); //overloaded method?
		
		sc0.close();
	}
}
