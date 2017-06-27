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
		// Labels
		JLabel lbl1 = new JLabel("First Value : ");
		JLabel lbl2 = new JLabel("Second Value : ");
		JLabel lbl3 = new JLabel("Result : ");
		
		lbl1.setBounds(20, 10, 70, 40);
		lbl2.setBounds(120, 10, 90, 40);
		lbl3.setBounds(250, 10, 80, 40);
		
		add(lbl1);
		add(lbl2);
		add(lbl3);
		
		// Text
		txt1 = new JTextField();
		txt2 = new JTextField();
		txt3 = new JTextField();
		
		txt1.setBounds(20, 50, 65, 30);
		txt2.setBounds(120, 50, 65, 30);
		txt3.setBounds(240, 50, 65, 30);
		txt3.setBorder(new BevelBorder(BevelBorder.LOWERED));
		
		add(txt1);
		add(txt2);
		add(txt3);
		
		// Signs & Buttons
		JLabel lblSumSign = new JLabel("+");
		JLabel lblEquals = new JLabel("=");
		JButton btnCalculate = new JButton("Calculate");
		
		lblSumSign.setBounds(100, 50, 10, 30);
		lblEquals.setBounds(210, 50, 10, 30);
		btnCalculate.setBounds(220, 170, 95, 30);
		
		add(lblSumSign);
		add(lblEquals);
		add(btnCalculate);
		
		//btnCalculate.addActionListener(this);
		
		btnCalculate.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				calculateButtonPressed();
			}
		});
	}
	
	private void calculateButtonPressed() 
	{
		try 
		{
			int num1 = Integer.parseInt(txt1.getText());
			try 
			{
				int num2 = Integer.parseInt(txt2.getText());
				int result = num1 + num2;
				txt3.setText("" + result);
			}
			catch(NumberFormatException e) 
			{
				JOptionPane.showMessageDialog(this, "Please type an int for the second number.");
				txt1.requestFocus();
				txt1.selectAll();
			}
		} 
		catch (NumberFormatException e) 
		{
			JOptionPane.showMessageDialog(this, "Please type an int for the first number.");
			txt1.requestFocus();
			txt1.selectAll();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JOptionPane.showMessageDialog(this, "Button was clicked.");
	}
	
	public static void main(String[] args) 
	{
		new MyCalculator().setVisible(true);
	}
	
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
}
