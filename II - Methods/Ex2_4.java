public class Ex2_4 {
	public static void main(String [] args) {
		Ex2_4 n0 = new Ex2_4();
		
		double num1 = 5;
		double num2 = 6.5;
		double num3 = 7.5;
		
		n0.calculateVolume2(num1, num2, num3);
		n0.calculateVolume1(num1, num2);
	}
	
	private double calculateVolume1(double x, double y) {
		double volume = (Math.PI)*(x*x)*(y);
		System.out.printf("The volume of the cylinder in question is : %.2f", volume);
		return volume;
	}
	
	private double calculateVolume2(double x, double y, double z) {
		double volume = x * y * z;	 
		System.out.println("The volume of the cube in question is : " + volume);
		return volume;
	}
}