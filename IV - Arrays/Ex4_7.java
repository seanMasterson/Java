import javax.swing.JOptionPane;

public class Ex4_7 
{
	public static final char EURO = '\u20ac';
	
	public static void main(String[] args) 
	{	
		int[] refNums = {1000, 1001, 1002, 1003, 1004};	
		String[] productNames = {"Keyboard", "Mouse", "Monitor", "Mouse Mat", "Set of Speakers"};	
		double[] prices = {49.99, 15.50, 124.99, 3.99, 23.50};
		
		System.out.println("Reference Number" + "\t" + "Product Name" + "\t" + "\t" + "Price");
		System.out.println("----------------" + "\t" + "------------" + "\t" + "\t" + "-----");
		 
		for(int i = 0; i < productNames.length; i++) 
		{
			System.out.printf("%-15d\t\t%-15s\t%9c%.2f", refNums[i], productNames[i], EURO, prices[i]);
			System.out.println();
		}
		
		String ref = JOptionPane.showInputDialog("Please enter your reference number: ");
		int reference = Integer.parseInt(ref);	
		
		boolean isFound = false;
			
		for(int i = 0; i < refNums.length; i++) 
		{	
			if(refNums[i] == reference) 
			{
				isFound = true;
				
				JOptionPane.showMessageDialog(null, String.format("You ordered a %s which costs %c%.2f", productNames[i], EURO, prices[i]));	
				
				String quantity =JOptionPane.showInputDialog(null, "How many would you like to order?");
				int qty = Integer.parseInt(quantity);
				
				double cost = (double)qty * prices[i];
				JOptionPane.showMessageDialog(null, String.format("The total cost of your shipping will be: %c%.2f", EURO, cost));
				
				break;
			}	
		}
		
		if(isFound != true)
				JOptionPane.showMessageDialog(null, "Reference Number Invalid. Please enter your reference number again.");
	}
}

/* printf(): The printf method takes a String argument
		 * 			 followed by any number of 'value' arguments. Each 
		 * 			 value will be used in place of the %s in the String
		 * 		     printf("String with %s", arg1, arg2, arg3, arg4, ...);
		 * 
		 *  % 	just means special characters follow (e.g. a placeholder)
		 *  1$	use the 1st argument specified.
		 *  2$	use the 2nd argument specified.
		 *  -	left align a column. aligning to the right takes no characters.
		 *  15	column width of 15 characters
		 *  s	String
		 *  d 	int
		 *  f 	floating point (double float)
		 *  b 	boolean 
		 *  c 	character
		 */
		
		/*switch(reference) 
		{
			case 1000:
				JOptionPane.showMessageDialog(null, "You ordered a " + productNames[0] + " which costs " + EURO + prices[0] + ".");
				break;
			case 1001:
				JOptionPane.showMessageDialog(null, "You ordered a " + productNames[1] + " which costs " + EURO + prices[1] + ".");
				break;
			case 1002:
				JOptionPane.showMessageDialog(null, "You ordered a " + productNames[2] + " which costs " + EURO + prices[2] + ".");
				break;
			case 1003:
				JOptionPane.showMessageDialog(null, "You ordered a " + productNames[3] + " which costs " + EURO + prices[3] + ".");
				break;
			case 1004:
				JOptionPane.showMessageDialog(null, "You ordered a " + productNames[4] + " which costs " + EURO + prices[4] + ".");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Reference Number Invalid. Please enter your reference number again.");
				break;
		}*/
		
		