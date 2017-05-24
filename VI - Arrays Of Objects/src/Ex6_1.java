public class Ex6_1 
{
	public static void main(String[] args) 
	{
		Ex6_1 n0 = new Ex6_1();
		
		Car c0 = new Car("Ford","Focus", 2.5);
		
		Car c1 = new Car("BMW", "M6", 3);
		
		Car c2 = new Car();
		c2.setMake("Audi");
		c2.setEngineSize(1.75);
		
		Car c3 = new Car("Volkswagon", "TY2", 2.7);

		Car c4 = new Car("Honda", "V4", 1.4);
		
		Car[] allCars = {c0, c1, c2, c3, c4};
		
		n0.printArray(allCars);
	}
	
	public void printArray(Car[] allCars) 
	{
		for(Car one: allCars)
		{
			System.out.println(one.toString() + "\n");
		}
		
		System.out.println();
		
		for(Car one: allCars)
		{
			System.out.println(one.returnMakeAndModel() + "\n");
		}
	}
}

class Car 
{
	// No- Args Constructor
	public Car() 
	{
		
	}
	
	// Parameterised Constructor
	public Car(String make, String model, double engineSize) 
	{
		this.make = make;
		this.model = model;
		setEngineSize(engineSize);
	}
	
	// Member Variables
	private String make;
	private String model;
	private double engineSize;
	
	// Get/Set Modifiers
	public String getMake() 
	{
		return make;
	}
	public void setMake(String make)
	{
		this.make = make;
	}
	
	public String getModel() 
	{
		return model;
	}
	public void setModel(String model) 
	{
		this.model = model;
	}
	
	public double getEngineSize() 
	{
		return engineSize;
	}
	public void setEngineSize(double engineSize) 
	{
		if(engineSize >= 1 && engineSize <= 2.8)
			this.engineSize = engineSize;
		else
			System.out.println(engineSize + " is not valid.");
	}
	
	@Override
	public String toString() 
	{
		return "Car [ Make: " + make + ", Model: " + model 
				+ ", Engine Size: " + engineSize + "]";
	}
	
	public String returnMakeAndModel() 
	{
		return "Car [ Make: " + make + ", Model: " + model + "]";
	}
}
