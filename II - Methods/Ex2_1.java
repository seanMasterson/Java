public class Ex2_1 
{
	public static void main(String [] args) 
	{
		int num1 = 5;
		int num2 = 8;	
		
		int result0 = add(num1, num2);
		System.out.println("The sum of the numbers equals: " + result0);
		
		int result1 = subtract(num1, num2);
		System.out.println("The difference of the numbers equals: " + result1);
		
		int result2 = multiply(num1, num2);
		System.out.println("The product of the numbers equals: " + result2);
		
		double result3 = divide(num1, num2);
		System.out.println("The quotient of the numbers equals: " + result3);
		
		int result4 = modulus(num1, num2);
		System.out.println("The modulus of the numbers equals: " + result4);			
	}
	
	public static int add(int x, int y) 
	{
		int sum = x	+ y;
		return sum;
	}
	
	public static int subtract(int x, int y)
	{
		int difference = x - y;
		return difference;
	}
	
	public static int multiply(int x, int y) 
	{
		int product = x * y;
		return product;
	}
	
	public static double divide(int x, int y) 
	{
		double quotient = x / y;
		return quotient;
	} 
	
	public static int modulus(int x, int y) 
	{
		int mod = x % y;
		return mod;
	}
}