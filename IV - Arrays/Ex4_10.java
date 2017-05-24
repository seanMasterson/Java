import javax.swing.JOptionPane;

public class Ex4_10 
{
	public static void main(String[] args) 
	{
		String[][] identities = {{"Joe Murphy","12 Main Street","Finglas","Dublin 11"}, 
							 {"Mary Jones","36 Amiens Street","Dublin 1"}, 
							 {"Pat O’Connor","26 South Main Street","Wexford","Co.Wexford"}};
	
	String nameRef = JOptionPane.showInputDialog("Who are you searching for?");
	
	if(nameRef.equals(identities[0][0]))
		System.out.println("Address: " + identities[0][1] + "\n" + "Town: " + identities[0][2] + "\n" + "County: " + identities[0][3]);
	
	else if(nameRef.equals(identities[1][0]))
		System.out.println("Address: " + identities[1][1] + "\n" + "Town: " + identities[1][2] + "\n");
	
	else
		System.out.println("Address: " + identities[2][1] + "\n" + "Town: " + identities[2][2] + "\n" + "County: " + identities[2][3] + "\n");
	}	
}