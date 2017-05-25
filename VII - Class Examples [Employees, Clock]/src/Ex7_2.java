public class Ex7_2 
{
	public static void main(String[] args) 
	{
		Clock c0 = new Clock(11, 30, 35);
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
}
