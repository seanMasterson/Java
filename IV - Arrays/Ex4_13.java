import java.util.Scanner;

public class Ex4_13
{
	public static final char EURO = '\u20ac';
	static Scanner sc0 = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		Ex4_13 n0 = new Ex4_13();
		
		int[] salesPeople = {1,2,3,4};
		int[] products = {1,2,3,4,5};
		int[][] sales = new int[4][5];
			
		boolean loopSwitch = true;
		
		do {
			int[][] totalMonthSales = n0.inputIncome(salesPeople, products, sales);
			n0.printData(salesPeople, products, totalMonthSales);
			
			System.out.println();
				
			System.out.print("Would you like to continue accumulating monthly incomes? (Y/N): ");
			String answer = sc0.next() + sc0.nextLine();
			// to clear a scanner of previous debris, use the .next() method and concatenate it onto the .next***()
			// method you wish to use, provided you intend to continue using the same scanner instance.	
			if(answer.equals("Y")) 
				System.out.print("Let's Go!\n");							
			else 
			{
				loopSwitch = false;
				System.out.println("***PROGRAM TERMINATED***");				
			}		
		} while (loopSwitch);
		
		sc0.close();
	}
	
	private int[][] inputIncome(int[] salesPeople, int[] products, int[][] sales) 
	{	
		for (int i = 0; i < salesPeople.length; i++)
		{
			for (int j = 0; j < products.length; j++)
			{
				System.out.printf("Please enter the total profit of Product [%d] from Salesperson [%d]:\n", j + 1, i + 1);
				int profit = sc0.nextInt();
				sales[i][j] += profit;		
			}
		}	
		
		return sales;
	}
	
	private void printData(int[] salesPeople, int[] products, int[][] sales) 
	{
		System.out.printf("%-15s%-12s%-9s%c%s\n", "Salesperson:", "Product:", "Total In ", EURO, ":");
		System.out.println("--------------------------------------\n");
		
		for (int i = 0; i < sales.length; i++)
		{
			for (int j = 0; j < sales[i].length; j++)
			{
				System.out.printf("%-15d%-17d%d\n", salesPeople[i], products[j], sales[i][j] );
			}
		}
		
		System.out.println();
		
		System.out.printf("\t%d\t%d\t%d\t%d\t%s\t\n", 1, 2, 3, 4, "Total");
		System.out.println("---------------------------------------------");
		
		int total = 0;
		int sumTotalProduct = 0;
		
		for (int i = 0; i < 5; i++) 
		{
			total = sales[0][i] + sales[1][i] + sales[2][i] + sales[3][i];
			sumTotalProduct += total;
			System.out.printf("%d  |\t%d\t%d\t%d\t%d\t%d\n", i + 1, sales[0][i], sales[1][i], sales[2][i], sales[3][i], total);		
		}
		
		System.out.println("--------------------------------------------");
		System.out.print("Totals\t");
		
		for (int i = 0; i < salesPeople.length; i++)
		{
			int totalProduct = 0;
			for (int j = 0; j < sales[i].length; j++) 
			{
				totalProduct += sales[i][j];
			}
			System.out.print(totalProduct + "\t");
		}
		
		System.out.print(sumTotalProduct + "\n");
	}
}
