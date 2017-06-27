import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton A1 = new JButton("New button");
		A1.setBounds(10, 11, 89, 91);
		frame.getContentPane().add(A1);
		
		JButton A2 = new JButton("New button");
		A2.setBounds(109, 11, 89, 91);
		frame.getContentPane().add(A2);
		
		JButton A3 = new JButton("New button");
		A3.setBounds(208, 11, 89, 91);
		frame.getContentPane().add(A3);
		
		JButton B1 = new JButton("New button");
		B1.setBounds(10, 113, 89, 91);
		frame.getContentPane().add(B1);
		
		JButton B2 = new JButton("New button");
		B2.setBounds(109, 113, 89, 91);
		frame.getContentPane().add(B2);
		
		JButton B3 = new JButton("New button");
		B3.setBounds(208, 113, 89, 91);
		frame.getContentPane().add(B3);
		
		JButton C1 = new JButton("New button");
		C1.setBounds(109, 215, 89, 91);
		frame.getContentPane().add(C1);
		
		JButton C2 = new JButton("New button");
		C2.setBounds(10, 215, 89, 91);
		frame.getContentPane().add(C2);
		
		JButton C3 = new JButton("New button");
		C3.setBounds(208, 215, 89, 91);
		frame.getContentPane().add(C3);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 317, 287, 318);
		panel.setBorder(BorderFactory.createTitledBorder("Let's Play!"));
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		frame.getContentPane().add(panel);
	}
}
