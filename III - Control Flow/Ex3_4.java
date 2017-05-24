public class Ex3_4 
{
	public static void main(String [] args) 
	{
		Ex3_4 n0 = new Ex3_4();
		
		int height = n0.calculateHeight(0);
		int breadth = n0.calculateBreadth(0);
		
		int answer = n0.calculatePerimeter(height, breadth);
		System.out.println("The perimeter of your rectangle is: " + answer);
	}
	
	private int calculateHeight(int x) 
	{
		int h = 0;
		for(int i = 0; i < 15; i++) 
		{
			h +=1;
		}		
		
		System.out.println("The height of your rectangle is: " + h);
		return h;
	}
	
	private int calculateBreadth(int x) 
	{
		int b = 0;
		for(int i = 0; i < 35; i++) 
		{
			b++;
		}	
		
		System.out.println("The breadth of your rectangle is: " + b);
		return b;		
	}
	
	private int calculatePerimeter(int x, int y) 
	{
		int result = 2 * (x + y);
		return result;
	}
}