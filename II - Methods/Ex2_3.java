public class Ex2_3 
{
	public static void main(String [] args) 
	{
		Ex2_3 n0 = new Ex2_3();
		
		int a = 5;
		double b = 7.4;
		double c = 10.6;
		
		n0.getTotal(a,b,c);
		n0.getAverage(a,b,c);
	}
	
	private double getTotal(int x, double y, double z) 
	{
		double tot = x + y + z;		 
		System.out.println("The total of the numbers provided equals: " + tot);
		return tot;
	}
	
	private double getAverage(int x, double y, double z) 
	{
		double avg = (x + y + z)/ 3;		 
		System.out.printf("The average of the numbers provided equals: %.2f ", avg);
		return avg;
	}
}