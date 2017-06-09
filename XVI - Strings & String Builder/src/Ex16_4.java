import java.util.Scanner;

public class Ex16_4 
{
	public static void main(String[] args) 
	{
		Scanner sc0 = new Scanner(System.in);
		System.out.println("Enter text: ");
		String userInput = sc0.nextLine();
		
		StringBuilder sb = new StringBuilder(userInput);
		sb.reverse();
		System.out.println(sb);
		sc0.close();
	}
}
