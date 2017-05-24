import java.util.Scanner;

public class Ex3_8 
{
	public static void main(String [] args) 
	{
		Scanner sc0 = new Scanner(System.in);	
		
		boolean loopSwitch = true;
		
		do 
		{
			System.out.print("Enter an integer: ");
			int a = sc0.nextInt();
			
			if(a >= 1 && a <= 10) 
				System.out.println("Alpha.");						
			else if(a >= 11 && a <= 20)
				System.out.println("Beta.");
			else if(a >= 21 && a <= 30) 
				System.out.println("Gamma.");
			else if(a >= 31 && a <= 40) 
				System.out.println("Delta.");
			else if(a >= 41 && a <= 50) 
				System.out.println("Epsilon.");
			else if(a == 0)
			{			
				loopSwitch = false;
				System.out.println("***PROGRAM TERMINATED***");	
				break;
			}
			else 
				System.out.println("Zeta.");			
			
			Scanner sc1 = new Scanner(System.in);
			System.out.print("Would you like to continue? (Y/N): ");
			String answer = sc1.nextLine();
					
			if(answer.equals("Y")) 
				System.out.print("Let's Go!\n");							
			else 
			{
				loopSwitch = false;
				System.out.println("***PROGRAM TERMINATED***");				
			}		
		} while(loopSwitch);	
		
		sc0.close();		
	}
}