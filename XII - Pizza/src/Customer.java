public class Customer 
{
	private String name;
	private String address;
	private String phone;
	private Pizza[] pizzas;
	private double totalCost;
	
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
	
	public String getPhone() 
	{
		return phone;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	
	public Pizza[] getPizzas() 
	{
		return pizzas;
	}
	public void setPizzas(Pizza[] pizzas) 
	{
		this.pizzas = pizzas;
	}
	
	public double getTotalCost() 
	{
		return totalCost;
	}
	
	public Customer() 
	{
		
	}
	
	public Customer(String name, String address, String phone, Pizza[] pizzas) 
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	@Override
	public String toString() 
	{
		return "";
	}
}
