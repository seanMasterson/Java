public class Ex2_7{
	public static void main(String [] args) {		
		double num1 = 5;
		double num2 = 6.5;
		
		double area1 = getArea1(num1, num2);		
		System.out.printf("The area of the cylinder in question is : %.2f \n", area1);
		double area2 = getArea2(num1);	
		System.out.println("The area of the cube in question is : " + area2);
	}
	
	private static double getArea1(double x, double y) {
		double area = 2*(Math.PI)*(x)*(y) + 2*(Math.PI)*(x * x);
		return area;
	}
	
	private static double getArea2(double x) {
		double area = 6*(x * x);	 
		return area;
	}
}