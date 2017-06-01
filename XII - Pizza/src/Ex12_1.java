public class Ex12_1
{
	public static void main(String[] args) 
	{
		String[] toppings0 = {"Mozzarella", "Ham"};
		String[] toppings1 = {"Peppers","Pepperoni","Pesto"};
		String[] toppings2 = {"Jalapenos", "Anchovies", "Capers"};
		String[] toppings3 = {"Garlic", "Olives"};
		String[] toppings4 = {"Chicken", "Beef", "BBQ Sauce", "Habaneros"};
		String[] toppings5 = {"Tomatoes", "Basil", "Mushrooms", "Parmesan"};
		
		Pizza p0 = new Pizza(toppings0, Pizza.PizzaSize.LARGE);
		Pizza p1 = new Pizza(toppings1, Pizza.PizzaSize.MEDIUM);
		Pizza p2 = new Pizza(toppings2, Pizza.PizzaSize.SMALL);
		
		Pizza pi0 = new Pizza(toppings3, Pizza.PizzaSize.EXTRA_LARGE);
		Pizza pi1 = new Pizza(toppings4, Pizza.PizzaSize.MEDIUM);
		
		Pizza piz0 = new Pizza(toppings5, Pizza.PizzaSize.LARGE);
		
		Pizza[] pizzaC0 = {p0, p1, p2};
		Pizza[] pizzaC1 = {pi0, pi1,};
		Pizza[] pizzaC2 = {piz0};
		
		Customer c0 = new Customer("Robert Fripp","30 Greenhill Applegate","+35387-095-4563", pizzaC0);
		Customer c1 = new Customer("George Romero","45 Peppincott","+35386-098-3461", pizzaC1);
		Customer c2 = new Customer("Bernie Sanders","90 Utsvolskya","+35385-675-4666", pizzaC2);
		
		Customer[] customers = {c0, c1, c2};
		
		Pizza[][] pizzaArrays = {pizzaC0, pizzaC1, pizzaC2};
		
		for(int i = 0; i < pizzaArrays.length; i++) 
		{
			System.out.println(customers[i].toString() + "\n");
			System.out.printf("\t\t***Pizzas for customer[%d]***\n", i + 1);
			System.out.println();
	
			for(int j = 0; j < pizzaArrays[i].length; j++) 	
			{
				System.out.println(pizzaArrays[i][j]);	
			}
			
			System.out.println(String.format("Full cost of order: \u20ac%.2f\n", customers[i].getTotalCost()));
		}
	}
}
