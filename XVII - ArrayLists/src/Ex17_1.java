import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ex17_1 
{
	public static void main(String[] args) 
	{
		Scanner sc0 = new Scanner(System.in);
		
		String[] names = {"Sean", "Asen", "Ewelina", "Vitalie", "Luca", "Emmanuel", 
						  "Stephen", "Pat", "Gabriella", "Agnes", "James", 
						  "Jay", "Darius", "Shane", "Damien", "Ben"};
			
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(names));
		
		System.out.println("Please enter a name: ");
		String name = sc0.nextLine();
		
		System.out.println(nameList.size());
		
		for(String n : nameList) 
		{
			if(name.equals(n)) 
				System.out.println(name + " was found at position " + (nameList.indexOf(n) + 1));
		}
		
		System.out.println("Select a name to remove: ");
		String nameRemove = sc0.nextLine();
		
		// Use iterator to manipulate an ArrayList in an iterative structure.
		for(Iterator<String> iterator = nameList.iterator(); iterator.hasNext();)
		{
			String n = iterator.next();
			if(n.equals(nameRemove)) 
			{
				System.out.println(name + " has been removed from position " + (nameList.indexOf(n) + 1));	
				iterator.remove();
			}
		}
		
		
		
		sc0.close();
	}
}
