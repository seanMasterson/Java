public class Ex2_8{
	public static void main(String [] args) {		
		int yearlySal = 30_150;
		System.out.println("Your current salary stands at: " + yearlySal);
		
		double ans0 = getWeeklySalary(yearlySal);
		System.out.printf("Your weekly salary is: %.2f\n", ans0);
		
		double ans1 = getMonthlySalary(yearlySal);
		System.out.printf("Your monthly salary is: %.2f\n", ans1);
		
		double ans2 = getPayRise(yearlySal, 4);
		System.out.printf("Your salary after a 4%% pay rise is: %.2f\n", ans2);
		
		ans2 = getPayRise(yearlySal, 6);
		System.out.printf("Your salary after a 6%% pay rise is: %.2f\n", ans2);
	}
	
	private static double getWeeklySalary(int sal) {
		double weekSal = sal / 52;		 		
		return weekSal;
	}
	
	private static double getMonthlySalary(int sal) {
		double monthSal= sal / 12;
		return monthSal;
	}
	
	private static double getPayRise(int sal, double percentPay) {
		double payIncr = sal + (sal * (percentPay)/100);
		return payIncr;
	}
}