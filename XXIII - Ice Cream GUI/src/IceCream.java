import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IceCream {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					IceCream window = new IceCream();
					window.frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IceCream() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 451, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnOrder = new JButton("Order");
		btnOrder.setBounds(237, 462, 89, 23);
		frame.getContentPane().add(btnOrder);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});
		btnExit.setBounds(336, 462, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel lblHeading = new JLabel("Please Place Your Order Below: ");
		lblHeading.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		lblHeading.setBounds(128, 11, 198, 43);
		frame.getContentPane().add(lblHeading);
	}
}
