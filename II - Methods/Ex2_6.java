public class Ex2_6 {
	public static void main(String [] args) {		
		Ex2_6 n0 = new Ex2_6();
	
		int a = 5;
		double b = 7.4;
		double c = 10.6;
		
		double total = n0.getTotal(a,b,c);
		System.out.printf("The total of the numbers provided equals: %.2f\n", total);
		
		double average = n0.getAverage(a,b,c);
		System.out.printf("The average of the numbers provided equals: %.2f ", average);
	}
	
	private double getTotal(int x, double y, double z) {
		double tot = (double)x + y + z;		 		
		return tot;
	}
	
	private double getAverage(int x, double y, double z) {
		double avg = ((double)x + y + z)/ 3;		 		
		return avg;
	}
}