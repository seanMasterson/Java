import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class MyCalculator extends JFrame implements ActionListener
{
	public MyCalculator() 
	{
		super("My Calculator"); // Title on Frame.
		setSize(350, 250);
		setLocation(850, 400);
		//setVisible(true); - Frames are invisible by default.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null); 
		initComponents();
	}
	
	private void initComponents() 
	{
		JLabel lbl1 = new JLabel("First Value : ");
		JLabel lbl2 = new JLabel("Second Value : ");
		JLabel lbl3 = new JLabel("Result : ");
		
		lbl1.setBounds(20, 10, 70, 40);
		lbl2.setBounds(120, 10, 90, 40);
		lbl3.setBounds(250, 10, 80, 40);
		
		add(lbl1);
		add(lbl2);
		add(lbl3);
		
		JTextField txt1 = new JTextField();
		JTextField txt2 = new JTextField();
		JTextField txt3 = new JTextField();
		
		txt1.setBounds(20, 50, 65, 30);
		txt2.setBounds(120, 50, 65, 30);
		txt3.setBounds(240, 50, 65, 30);
		txt3.setBorder(new BevelBorder(BevelBorder.LOWERED));
		
		add(txt1);
		add(txt2);
		add(txt3);
		
		JLabel lblSumSign = new JLabel("+");
		JLabel lblEquals = new JLabel("=");
		JButton btnCalculate = new JButton("Calculate");
		
		lblSumSign.setBounds(100, 50, 10, 30);
		lblEquals.setBounds(210, 50, 10, 30);
		btnCalculate.setBounds(220, 170, 95, 30);
		
		add(lblSumSign);
		add(lblEquals);
		add(btnCalculate);
		
		btnCalculate.addActionListener(this);
	}
	
	public static void main(String[] args) 
	{
		new MyCalculator().setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JOptionPane.showMessageDialog(this, "Button was clicked.");
	}
}
