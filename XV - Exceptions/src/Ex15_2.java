public class Ex15_2 {
	public static void main(String[] args) {
		try{
			Clock_XV c0 = new Clock_XV(23, 59, 59);
			System.out.println(c0);
			c0.incrementHours(25);
			System.out.println(c0);
			c0.incrementMinutes(20);
			System.out.println(c0);
			c0.resetTime();
			System.out.println(c0);
			c0.incrementSeconds(5);
			System.out.println(c0);
			c0.incrementMinutes(20);
			System.out.println(c0);
			c0.incrementSeconds(21);
			System.out.println(c0);
			c0.incrementHours(20);
			System.out.println(c0);
		}
		catch(InvalidTimeException t) {
			t.getMessage();
			t.printStackTrace();
		}
		finally {
			System.out.println("Finally...");
		}
	}
}
