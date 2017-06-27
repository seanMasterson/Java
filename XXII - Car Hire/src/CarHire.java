import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JRadioButton;
import javax.swing.Box;
import javax.swing.border.BevelBorder;
import javax.swing.JList;
import java.awt.Scrollbar;
import javax.swing.JScrollBar;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import java.awt.ScrollPane;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Panel;
import javax.swing.JPanel;

public class CarHire 
{
	private JFrame frame;
	private JTextField txtOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					CarHire window = new CarHire();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CarHire() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 526, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 11, 129, 20);
		frame.getContentPane().add(comboBox);
		
		txtOutput = new JTextField();
		txtOutput.setBounds(10, 228, 381, 173);
		frame.getContentPane().add(txtOutput);
		txtOutput.setColumns(10);
		
		JButton btnPlaceOrder = new JButton("Place Order");
		btnPlaceOrder.setBounds(401, 228, 103, 35);
		frame.getContentPane().add(btnPlaceOrder);
		
		JButton btnSaveToFile = new JButton("Save To File");
		btnSaveToFile.setBounds(401, 274, 103, 35);
		frame.getContentPane().add(btnSaveToFile);
		
		JButton btnLoadFromFile = new JButton("Load From File");
		btnLoadFromFile.setBounds(401, 320, 103, 35);
		frame.getContentPane().add(btnLoadFromFile);
		
		JButton btnClear = new JButton("Clear All");
		btnClear.setBounds(401, 366, 103, 35);
		frame.getContentPane().add(btnClear);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 76, 92, 141);
		frame.getContentPane().add(textPane);
		
		Panel pnl3 = new Panel();
		pnl3.setBounds(299, 76, 92, 141);
		frame.getContentPane().add(pnl3);
		
		JRadioButton rdbtnAnyFuel = new JRadioButton("Any Fuel");
		pnl3.add(rdbtnAnyFuel);
		
		JRadioButton rdbtnPetrol = new JRadioButton("Petrol");
		pnl3.add(rdbtnPetrol);
		
		JRadioButton rdbtnDiesel = new JRadioButton("Diesel");
		pnl3.add(rdbtnDiesel);
		
		JRadioButton rebtnHybrid = new JRadioButton("Hybrid");
		pnl3.add(rebtnHybrid);
		
		JRadioButton rdbtnBioethanol = new JRadioButton("Bioethanol");
		pnl3.add(rdbtnBioethanol);
		
		Panel pnl1 = new Panel();
		pnl1.setBounds(401, 76, 69, 141);
		frame.getContentPane().add(pnl1);
		
		JRadioButton rdbtn2 = new JRadioButton("2");
		pnl1.add(rdbtn2);
		
		JRadioButton rdbtn4 = new JRadioButton("4");
		pnl1.add(rdbtn4);
		
		JRadioButton rdbtn5 = new JRadioButton("5");
		pnl1.add(rdbtn5);
		
		JRadioButton rdbtn7 = new JRadioButton("7");
		pnl1.add(rdbtn7);
		
		JRadioButton rdbtn8 = new JRadioButton("8");
		pnl1.add(rdbtn8);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds(85, 76, 17, 146);
		frame.getContentPane().add(scrollbar);
		
		JPanel pnl2 = new JPanel();
		pnl2.setBounds(128, 129, 75, 88);
		frame.getContentPane().add(pnl2);
		
		JRadioButton rdbtnAny = new JRadioButton("Any");
		pnl2.add(rdbtnAny);
		rdbtnAny.setAlignmentX(Component.CENTER_ALIGNMENT);
		rdbtnAny.setVerticalTextPosition(SwingConstants.TOP);
		rdbtnAny.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JRadioButton rdbtnManual = new JRadioButton("Manual");
		pnl2.add(rdbtnManual);
		rdbtnManual.setAlignmentY(Component.TOP_ALIGNMENT);
		
		JRadioButton rdbtnAutomatic = new JRadioButton("Automatic");
		pnl2.add(rdbtnAutomatic);
		rdbtnAutomatic.setAlignmentY(Component.TOP_ALIGNMENT);
	}
}
