public class Ex5_3 
{
	public static void main(String[] args) 
	{
		GymMembership g0 = new GymMembership("Patrick Stewart", 3);
		
		GymMembership g1 = new GymMembership("Sean Masterson", 2);
		
		GymMembership g2 = new GymMembership("Phife Dawg", 1);
		
		GymMembership[] allMembers = {g0, g1, g2};
		
		for(GymMembership member: allMembers)
		{
			System.out.println(member.toString());
		}
	}
}

class GymMembership 
{
	private String memName;
	private int memNumber;
	private static int memCounter = 100;
	private double cost;
	private int payFrequency;
	
	private static final int PAYG = 1;
	private static final int PAY_MONTH = 2;
	private static final int PAY_YEAR = 3;
	
	public String getMemName() 
	{
		return memName;
	}
	public void setMemName(String memName, int payFrequency)
	{
		this.memName = memName;
	}
	
	public String getPayFrequency() 
	{
		switch(payFrequency)
		{
			case PAYG:
				return "Pay As You Go.";
			case PAY_MONTH:
				return "Monthly";
			default:
				return "Yearly";
		}
	} 
	public void setPayFrequency(int payFrequency)
	{
		switch(payFrequency)
		{
			case PAYG:
			case PAY_MONTH:
			case PAY_YEAR:
				this.payFrequency = payFrequency;
				break;
			default:
				System.out.println("Not valid. Reset to default.");
				this.payFrequency = PAYG;
				break;
		}
	}
	
	public double calculateCost()
	{
		double memCost = 500;
		if(payFrequency == PAYG)
			cost = memCost / 52;
		else if(payFrequency == PAY_MONTH)
			cost = memCost / 12;
		else 
			cost = memCost;
		return cost;
	}
	
	public GymMembership()
	{
		memNumber = memCounter++;
		payFrequency= PAYG;
		calculateCost();
	}
	
	public GymMembership(String memName, int payFrequency) 
	{
		this();
		this.memName = memName;
		setPayFrequency(payFrequency);
		calculateCost();
	}
	
	@Override
	public String toString() 
	{
		return "Member Name: " + memName + ", Membership Number: " 
				+ memNumber + ", Payment Freqency: " + getPayFrequency()
				+ String.format(", Cost: €%.2f ", calculateCost()) + "\n";
	}
}
