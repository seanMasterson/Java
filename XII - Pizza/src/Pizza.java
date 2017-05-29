public class Pizza 
{
	private String[] toppings = {"Pepperoni", "Olives", "Parmesan", "Capers", "Anchovies"};
	private double price;
	private PizzaSize pizzaSize;
	
	private static final double PRICE_SMALL = 8d;
	private static final double PRICE_MEDIUM = 10d;
	private static final double PRICE_LARGE = 12.50;
	private static final double PRICE_EXTRA_LARGE = 18.50;
			
	private static final double PRICE_TOPPING_ONE = 1d;
	private static final double PRICE_TOPPING_TWO = 1.20;
	private static final double PRICE_TOPPING_THREE = 1.80;
	private static final double PRICE_TOPPING_FOUR = 1.50;
	private static final double PRICE_TOPPING_FIVE = 1.30;
	
	public enum PizzaSize 
	{
		SMALL (7),
		MEDIUM (9),
		LARGE (12),
		EXTRA_LARGE (16);
		
		private int diameter;
		
		PizzaSize(int diameter) 
		{
			this.diameter = diameter;
		}
		
		public int getDiameter()
		{
			return diameter;
		}
	};
	
	public String[] getToppings() 
	{
		return toppings;
	}
	public void setToppings(String[] toppings) 
	{
		this.toppings = toppings;
	}
	
	public double calculatePrice()
	{
		
		return price;
	}
	
	public Pizza() 
	{
		
	}
	
	public Pizza(String[] toppings, double price) 
	{
		
	}
	
	@Override
	public String toString() 
	{
		return "";
	}
}
