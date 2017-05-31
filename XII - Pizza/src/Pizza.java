import java.util.Arrays;

public class Pizza 
{
	private String[] toppings;
	private double price;
	private PizzaSize pizzaSize;
	
	private static final double PRICE_SMALL = 8d;
	private static final double PRICE_MEDIUM = 10d;
	private static final double PRICE_LARGE = 12.50;
	private static final double PRICE_EXTRA_LARGE = 18.50;
			
	private static final double PRICE_TOPPING_ONE = 1d;
	private static final double PRICE_TOPPING_TWO = 1.20;
	private static final double PRICE_TOPPING_THREE = 1.50;
	private static final double PRICE_TOPPING_FOUR = 1.80;
	
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
		
	public PizzaSize getPizzaSize() 
	{
		return pizzaSize;
	}
	public void setPizzaSize(PizzaSize pizzaSize) 
	{
		this.pizzaSize = pizzaSize;
	}
	
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
		switch(pizzaSize) 
		{
			case SMALL:
				this.price = PRICE_SMALL; 
				price += PRICE_TOPPING_ONE;
				break;
			case MEDIUM:
				this.price = PRICE_MEDIUM;
				price += PRICE_TOPPING_TWO;
				break;
			case LARGE:
				this.price = PRICE_LARGE; 
				price += PRICE_TOPPING_THREE;
				break;
			case EXTRA_LARGE:
				this.price = PRICE_EXTRA_LARGE; 
				price += PRICE_TOPPING_FOUR;
				break;
			default:
				System.out.println("Invalid Pizza Size. Reset to Medium Size.");
				this.price = PRICE_MEDIUM;
				break;
		}
		return price;
	}
	
	public Pizza() 
	{
		
	}
	
	public Pizza(String[] toppings, PizzaSize pizzaSize) 
	{
		this();
		setToppings(toppings);
		setPizzaSize(pizzaSize);
		//calculatePrice();	
	}
	
	@Override
	public String toString() 
	{
		return "Your Pizza [Size: " + getPizzaSize().toString() +
				", Toppings: " + Arrays.toString(toppings) + 
				String.format(", Price: \u20ac%.2f", calculatePrice()) + "]\n";
	}
}
