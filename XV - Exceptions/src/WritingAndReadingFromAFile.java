import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class WritingAndReadingFromAFile 
{
	public static void main(String[] args) 
	{
		String fileName = "src/Thursday.txt";
		
		try 
		{
			PrintWriter p = new PrintWriter(fileName);
			// We only want to write to the file when the previous line is successful.
			// If it is not successful, the execution will be transferred to the catch block.
			p.println("Hello");
			p.println("It is Thursday.");
			p.println("Today, a young man on acid realised that all matter is merely energy condensed to a slow vibration.");
			p.flush();
			p.close();
		} 
		catch (FileNotFoundException e) 
		{
			JOptionPane.showMessageDialog(null, "File Is Unknown!");
			e.getMessage();
			e.printStackTrace();
		}
		
		try 
		{
			FileReader fr = new FileReader(fileName);
			BufferedReader b0 = new BufferedReader(fr);
			System.out.println(b0.readLine());
			System.out.println("Contents of file...");
			String line = "";
			while((line = b0.readLine()) != null) 
			{
				System.out.println(line); 
			}
			b0.close();
		}
		/* FileNotFoundException may be thrown from a creating a FileRedaer object if it
		 * cannot be found.*/
		catch(FileNotFoundException e) 
		{
			JOptionPane.showMessageDialog(null, "File does not exist!");
			e.getMessage();
			e.printStackTrace();
		}
		/* IOException might be thrown  from br.readLine() if there is a problem reading
		 * from the file, e.g. if the file disappears
		 * */
		catch(IOException e) 
		{
			e.getMessage();
			e.printStackTrace();
		}
		catch(Exception e) 
		{
			e.getMessage();
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("Will execute ALWAYS.");
		}
		// The following line will execute regardless of the result of the try/catch block above.
		System.out.println("End of Main.");
	}
}
