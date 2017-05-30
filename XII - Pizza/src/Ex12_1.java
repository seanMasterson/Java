public class Ex12_1
{
	public static void main(String[] args) 
	{
		Customer c0 = new Customer("Robert Fripp","30 Greenhill Applegate","+35387-095-4563");
		Customer c1 = new Customer("Papa Emeritus","45 Peppincott","+35386-098-3461");
		Customer c2 = new Customer("Nergal","90 Utsvolskya","+35385-675-4666");
		
		Customer[] customers = {c0, c1, c2};
	
		for(Customer c : customers) 
		{
			System.out.println(c.toString());
		}
		
		Pizza p0 = new Pizza("Anchovies", Pizza.PizzaSize.MEDIUM);
		Pizza p1 = new Pizza("Parmesan", Pizza.PizzaSize.SMALL);
		Pizza p2 = new Pizza("Pesto", Pizza.PizzaSize.EXTRA_LARGE);
		
		Pizza[] pizzas = {p0, p1, p2};
		
		for(Pizza p : pizzas) 
		{
			System.out.println(p.toString());
		}
	}
}
