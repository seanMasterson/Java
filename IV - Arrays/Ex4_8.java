public class Ex4_8 
{
	public static void main(String [] args) 
	{
		Ex4_8 n0 = new Ex4_8();
		
		int[] array0 = {1,2,3,4,5,6,7,8,9,10};
				
		n0.printValues(array0);
	}
	
	private void printValues(int[] array0) 
	{
		int l = array0[0];
		int s = array0[0];
		
		for(int i : array0) 
		{
			if(i > l)
				l = i;			
		}
		
		System.out.println("The largest number in the array is: " + l);
		
		for(int i : array0) 
		{
			if(i < s)
				s = i;	
		}
		System.out.println("The smallest number in the array is: " + s);
	}
}
