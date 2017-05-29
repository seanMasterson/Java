import java.util.Scanner;

public class BankAccount 
{
	Scanner sc0 = new Scanner(System.in);
	
	public static final char EURO = '\u20ac';
	
	private String name;
	private String address;
	private int accountNum;
	private double balance;
	
	private static double interest = 0.013; //Bank of Ireland 5 Year Term Deposit.
	public static int accounts = 0;
	public int count;
	private static int numAccount = 400_150;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public int getAccountNum() 
	{
		return accountNum;
	}
	public void setAccountNum(int accountNum) 
	{
		this.accountNum = accountNum;
	}
	
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
	public double depositMoney() 
	{
		System.out.print("Select the desired amount of money to deposit: ");
		double deposit = sc0.nextInt();
		
		balance += deposit;
		
		System.out.println();
		return balance;
	}
	
	public double withdrawMoney() 
	{
		System.out.print("Select the desired amount of money to withdraw: ");
		double withdrawal = sc0.nextInt();
		
		if(withdrawal >= balance)
			System.out.println("***ERROR: CANNOT OVERDRAW***");
		else
			balance -= withdrawal;
		
		System.out.println();
		return balance;
	}
	
	public double addInterest() 
	{
		double simpInterest = balance * interest;
		balance -= simpInterest; 
		
		return balance;
	}
	
	public double checkBalance() 
	{
		System.out.print(String.format("New Balance: %.2f", balance));
		System.out.println();
		return balance;
	}
	
	private BankAccount() 
	{
		count = accounts++ + 1;
		accountNum = numAccount++;
	}
	
	public BankAccount(String name, String address, double balance) 
	{
		this();
		this.name = name;
		this.address = address;
		this.balance = balance;
	}
	
	@Override
	public String toString() 
	{
		return "Bank Account #" + count + " [Name: " + name + " | Address: " + address + "\n" + 
			   " \t\t| Account Number: " + accountNum + " | " + String.format("Bank Balance: %.2f", getBalance()) + "]";
	}
}
