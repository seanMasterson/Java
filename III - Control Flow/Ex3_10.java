import java.util.Scanner;

public class Ex3_10 
{
	public static final String EURO = "\u20ac";
	
	public static void main(String [] args) 
	{
		Ex3_10 n0 = new Ex3_10();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter quantity of bags please: ");
		String order = sc.nextLine();
		
		int bagQuantity = Integer.parseInt(order);
		double bagPrice = 1.25;
		double bagPriceDiscount = bagPrice * 0.75;		
		
		double invoice = n0.calculateOrder(bagQuantity, bagPrice, bagPriceDiscount);
		System.out.printf("Final price : %.2f", EURO + invoice);
		
		sc.close();
	}
	
	private double calculateOrder(int quan, double price, double discount) 
	{
		if(quan > 100) 
		{
			int discountQuan = quan - 100;
			double discountResult = (double)discount * discountQuan;
			
			double resultant = (price * 100) + discountResult;
			return resultant;
		}
		else 
		{
			double resultant = price * (double)quan;
			return resultant;
		}
	}
}