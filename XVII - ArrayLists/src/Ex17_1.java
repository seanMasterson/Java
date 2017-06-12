import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex17_1 
{
	public static void main(String[] args) 
	{
		Scanner sc0 = new Scanner(System.in);
		
		String[] names = {"Sean ", "Asen ", "Ewelina ", "Vitalie ", "Luca ", "Emmanuel ", 
						  "Stephen ", "Pat ", "Gabriella ", "Agnes ", "James ", 
						  "Jay ", "Darius ", "Shane ", "Damien ", "Ben "};
			
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(names));
		
		System.out.println("Please enter a name: ");
		String name = sc0.nextLine();
		
		for(String n : nameList) 
		{
			if(name == n) 
				System.out.println(name + "was found at position " + n);
			else
				System.out.println("Name not found.");
		}
		
		sc0.close();
	}
}
