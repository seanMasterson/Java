public class Ex2_2 {
	public static void main(String [] args){
		Ex2_2 n0 = new Ex2_2();
		
		double p = 25.50;
		int q = 5;
		
		n0.calculateTotal(p,q);
	}
	
	private double calculateTotal(double price, int quantity) {
		double total = price * quantity;
		System.out.println("The calculated cost of your purchase is: " + total);
		return total;		
	}
}
