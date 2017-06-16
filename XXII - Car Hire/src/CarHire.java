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

public class CarHire {

	private JFrame frame;
	private JTextField txtOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarHire window = new CarHire();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CarHire() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		
		Panel panel = new Panel();
		panel.setBounds(299, 76, 92, 141);
		frame.getContentPane().add(panel);
		
		JRadioButton rdbtnAnyFuel = new JRadioButton("Any Fuel");
		panel.add(rdbtnAnyFuel);
		
		JRadioButton rdbtnPetrol = new JRadioButton("Petrol");
		panel.add(rdbtnPetrol);
		
		JRadioButton rdbtnDiesel = new JRadioButton("Diesel");
		panel.add(rdbtnDiesel);
		
		JRadioButton rebtnHybrid = new JRadioButton("Hybrid");
		panel.add(rebtnHybrid);
		
		JRadioButton rdbtnBioethanol = new JRadioButton("Bioethanol");
		panel.add(rdbtnBioethanol);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(401, 76, 69, 141);
		frame.getContentPane().add(panel_1);
		
		JRadioButton rdbtn2 = new JRadioButton("2");
		panel_1.add(rdbtn2);
		
		JRadioButton rdbtn4 = new JRadioButton("4");
		panel_1.add(rdbtn4);
		
		JRadioButton rdbtn5 = new JRadioButton("5");
		panel_1.add(rdbtn5);
		
		JRadioButton rdbtn7 = new JRadioButton("7");
		panel_1.add(rdbtn7);
		
		JRadioButton rdbtn8 = new JRadioButton("8");
		panel_1.add(rdbtn8);
		
		Panel panel_2 = new Panel();
		panel_2.setBounds(108, 135, 92, 87);
		frame.getContentPane().add(panel_2);
		
		JRadioButton rdbtnAny = new JRadioButton("Any");
		rdbtnAny.setAlignmentX(Component.CENTER_ALIGNMENT);
		rdbtnAny.setVerticalTextPosition(SwingConstants.TOP);
		rdbtnAny.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_2.add(rdbtnAny);
		
		JRadioButton rdbtnManual = new JRadioButton("Manual");
		rdbtnManual.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_2.add(rdbtnManual);
		
		JRadioButton rdbtnAutomatic = new JRadioButton("Automatic");
		rdbtnAutomatic.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_2.add(rdbtnAutomatic);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds(85, 76, 17, 146);
		frame.getContentPane().add(scrollbar);
	}
}
