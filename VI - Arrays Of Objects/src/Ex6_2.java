public class Ex6_2 
{
	public static void main(String[] args) 
	{
		PC pc0 = new PC();
		PC pc1 = new PC(16, PC.HardDrive.HD_1TB, PC.OperatingSystem.OS_64,"21:9");
		PC pc2 = new PC(8,PC.HardDrive.HD_2TB, PC.OperatingSystem.OS_32, "4:3");
		
		PC[] computers = {pc0, pc1, pc2};
		
		printArray(computers);
	}
	
	public static void printArray(PC[] computers)
	{
		for(PC owner: computers)
		{
			if(owner.calculateCost() >= 500d)
				System.out.println(owner.toString());
		}
	}
}

class PC 
{
	private int ram;
	private HardDrive hardDrive;
	private OperatingSystem os;
	private String monitorSize;
	private static double cost; // Default price for a New PC.
	
	private static int classCounter = 1;
	private int count;
	
	private static final int RAM_4GB = 4;
	private static final int RAM_8GB = 8;
	private static final int RAM_16GB = 16;
	
	public enum HardDrive 
	{
		HD_500GB,
		HD_1TB,
		HD_2TB
	};
	
	public enum OperatingSystem 
	{
		OS_32,
		OS_64
	};
	
	private static final String MS_43 = "4:3";
	private static final String MS_169 = "16:9";
	private static final String MS_219 = "21:9";
	
	public int getRam() 
	{
		return ram;
	}
	public void setRam(int ram) 
	{
		switch(ram) 
		{
			case RAM_4GB:
			case RAM_8GB:
			case RAM_16GB:
				this.ram = ram;
				break;
			default:
				System.out.println("Not valid. Reset to 4GB.");
				this.ram = RAM_4GB;
				break;
		}
	}
	
	public HardDrive getHardDrive() 
	{
		return hardDrive;
	}
	public void setHardDrive(HardDrive hardDrive) 
	{
		this.hardDrive = hardDrive;
	}
	
	public OperatingSystem getOS() 
	{
		return os;
	}
	public void setOS(OperatingSystem os) 
	{
		this.os = os;
	}
	
	public String getMonitorSize() 
	{
		return monitorSize;
	}
	public void setMonitorSize(String monitorSize) 
	{
		switch(monitorSize) 
		{
			case MS_43:
			case MS_169:
			case MS_219:
				this.monitorSize = monitorSize;
				break;
			default:
				System.out.println("Not valid. Reset to 16:9 ratio.");
				this.monitorSize = MS_169;
				break;
		}
	}
	
	public double calculateCost() 
	{
		cost = 400;
		if(ram == RAM_8GB) 
			cost += 20;
		else if(ram == RAM_16GB) 
			cost += 35;
		
		if(hardDrive == HardDrive.HD_1TB) 
			cost += 50;
		else if(hardDrive == HardDrive.HD_2TB) 
			cost += 85;
		
		if(os == OperatingSystem.OS_64)
			cost += 60;
		
		if(monitorSize == MS_43)
			cost -= 40;
		else if(monitorSize == MS_219)
			cost += 20;
		
		return cost;
	}
	
	public PC() 
	{
		count = classCounter++;
		ram = RAM_4GB;
		hardDrive = HardDrive.HD_500GB;
		os = OperatingSystem.OS_32;
		monitorSize = MS_169;
		calculateCost();
	}
	
	public PC(int ram, HardDrive hardDrive, OperatingSystem os, String monitorSize) 
	{
		this();
		setRam(ram);
		setHardDrive(hardDrive);
		setOS(os);
		setMonitorSize(monitorSize);
		calculateCost();
	}
	
	@Override
	public String toString() 
	{
		return "Customer #" + count + " {RAM: " + getRam() + ", Hard Drive: " + getHardDrive() + 
				", Operating System: " + getOS() + ", Monitor Size: " + getMonitorSize() + 
				String.format(", Cost: \u20ac%.2f", calculateCost()) + "}";
	}
}
