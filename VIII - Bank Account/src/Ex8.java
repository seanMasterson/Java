public class Ex8 
{
	public static void main(String[] args) 
	{
		BankAccount b0 = new BankAccount("Mack The Knife", "1 Place Igor Stravinsky", 30);
		
		BankAccount b1 = new BankAccount("Sonny Rollins", "23 Tin Pan Alley", 35);
	
		BankAccount b2 = new BankAccount("George Gershwin", "La Rue D'Avion", 10);
		
		BankAccount b3 = new BankAccount("Miles Davis", "45 Helen Merrill Street", 145);
		
		BankAccount[] bankAccounts = {b0, b1, b2, b3};
		
		for(BankAccount b : bankAccounts)
		{
			System.out.println(b.toString());
			System.out.println();
		}
		
		System.out.println("Number of accounts opened: " + BankAccount.accounts + "\n");
		
		System.out.println("Current Interest Rate set at: 1.30%\n" );
		
		for(int i = 0; i < bankAccounts.length; i++) 
		{
			System.out.printf("***TRANSACTION FOR ACCOUNT [%d]***\n", i + 1);
			System.out.println();
			bankAccounts[i].depositMoney();
			bankAccounts[i].withdrawMoney();
			bankAccounts[i].addInterest();
			bankAccounts[i].checkBalance();
			System.out.println();
		}
	}
}
