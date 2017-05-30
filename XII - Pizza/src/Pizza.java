public class Pizza 
{
	private String[] toppings = {"Pepperoni","Anchoives","Parmesan","Olives","Capers"};
	private String readTopping;
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
		
	public PizzaSize getPizzaSize(PizzaSize pizzaSize) 
	{
		return pizzaSize;
	}
	public void setPizzaSize() 
	{
		this.pizzaSize = pizzaSize;
	}
	
	public String getReadTopping(String readTopping) 
	{
		return readTopping;
	}
	public void setReadTopping() 
	{
		switch(readTopping) 
		{
		case "Pepperoni":
			this.readTopping = toppings[0];
			break;
		case "Anchovies":
			this.readTopping = toppings[1];
			break;
		case "Parmesan":
			this.readTopping = toppings[2];
			break;
		case "Olives":
			this.readTopping = toppings[3];
			break;
		case "Capers":
			this.readTopping = toppings[4];
			break;
		default:
			System.out.println("Invalid topping. Reset to Pepperoni.");
			this.readTopping = readTopping;
			break;
		}	
	}
	
	public double calculatePrice()
	{
		switch(pizzaSize) 
		{
			case SMALL:
				this.price = PRICE_SMALL;
				break;
			case MEDIUM:
				this.price = PRICE_MEDIUM;
				break;
			case LARGE:
				this.price = PRICE_LARGE;
				break;
			case EXTRA_LARGE:
				this.price = PRICE_EXTRA_LARGE;
				break;
			default:
				System.out.println("Invalid Pizza Size. Reset to Medium Size.");
				this.price = PRICE_MEDIUM;
				break;
		}
		
		if(readTopping == toppings[0])
			price += PRICE_TOPPING_ONE;
		else if(readTopping == toppings[1])
			price += PRICE_TOPPING_TWO;
		else if(readTopping == toppings[2])
			price += PRICE_TOPPING_THREE;
		else if(readTopping == toppings[3])
			price += PRICE_TOPPING_FOUR;
		else if(readTopping == toppings[4])
			price += PRICE_TOPPING_FIVE;
			
		return price;
	}
	
	public Pizza() 
	{
		
	}
	
	public Pizza(String readTopping, double price, PizzaSize pizzaSize) 
	{
		this();
		setReadTopping();
		calculatePrice();
		setPizzaSize();
	}
	
	@Override
	public String toString() 
	{
		return "Your Pizza [Size: " + getPizzaSize(pizzaSize) + ", Toppings: " + getReadTopping(readTopping) +", Price: ]";
	}
}
