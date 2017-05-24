public class Ex5_4 
{
	public static void main(String[] args) 
	{
		EmailAccount em0 = new EmailAccount("john.mcgilp@tcd.ie", "Xenon34", 500.50);
		System.out.println(em0.toString());
		
		EmailAccount em1 = new EmailAccount();
		em1.setAddress("semaster@tcd.ie");
		em1.setPassword("noneOfYourBusiness@2017");
		em1.setStorage(300);
		System.out.println(em1.toString());
		
		EmailAccount em2 = new EmailAccount("helen.merrill@jazz.aol", "Gershwin£!36", 4.6);
		System.out.println(em2.toString());
	}	
}

class EmailAccount
{
	private String address;
	private String password;
	private double storage;
	
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		if(address.contains("@") && address.contains("."))
			this.address = address;
	}
	
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public double getStorage() 
	{
		return storage;
	}
	public void setStorage(double storage) 
	{
		this.storage = storage;
	}
	
    public EmailAccount() 
	{
		
	}
    
    public EmailAccount(String address, String password, double storage) 
    {
    	this();
    	setAddress(address);
    	this.password = password;
    	this.storage = storage;
    }
	
	@Override
	public String toString() 
	{
		return "Email Address: " + address + ", Password: " + password + ", Maximum Storage Limit: " + storage;
	}
}
