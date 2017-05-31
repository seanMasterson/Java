public class Ex12_1
{
	public static void main(String[] args) 
	{
		Customer c0 = new Customer("Robert Fripp","30 Greenhill Applegate","+35387-095-4563");
		Customer c1 = new Customer("George Romero","45 Peppincott","+35386-098-3461");
		Customer c2 = new Customer("Bernie Sanders","90 Utsvolskya","+35385-675-4666");
		
		String[] toppings0 = {"Mozzarella","Pineapple","Ham"};
		String[] toppings1 = {"Peppers","Pepperoni","Pesto"};
		String[] toppings2 = {"Jalapenos", "Anchovies", "Capers"};
		
		Pizza p0 = new Pizza(toppings0, Pizza.PizzaSize.LARGE);
		Pizza p1 = new Pizza(toppings1, Pizza.PizzaSize.MEDIUM);
		Pizza p2 = new Pizza(toppings2, Pizza.PizzaSize.SMALL);
		
		Customer[] customers = {c0, c1, c2};
		Pizza[] pizzas = {p0, p1, p2};
		for(int i = 0; i < customers.length; i++) 
		{
			System.out.println(customers[i].toString());
			System.out.println(pizzas[i].toString());
		}
	}
}
