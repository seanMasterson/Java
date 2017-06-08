public class Ex16_1 
{
	public static void main(String[] args) 
	{
		String stringA = new String("Monday");
		String stringB = new String("Monday");
		String stringC = "Tuesday";
		String stringD = stringC;
		String stringE = new String("Tuesday");
		
		//a
		 System.out.println("//a " + (stringA == stringB));
	
		//b
		boolean partA = (stringC == stringD)? true : false;
		System.out.println("//b " + partA);
		
		//c
		if(stringA.equals(stringB) && stringC.equals(stringD))
			System.out.println("//c " + true);
		else
			System.out.println("//c " + false);
		
		//d
		System.out.println("//d " + (stringC == stringE));
		
		//e
		if(stringC.toUpperCase().equals(stringD))
			System.out.println("//e " + true);
		else
			System.out.println("//e " + false);
		
		//f
		if(stringC.equals("Tuesday") && stringD.equals("Tuesday"))
			System.out.println("//f " + true);
		else
			System.out.println("//f " + false);
	}
}
