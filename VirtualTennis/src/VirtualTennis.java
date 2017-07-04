import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class VirtualTennis extends Applet implements Runnable, KeyListener {
	
	private static final long serialVersionUID = 15L;

	private final int WIDTH = 700, HEIGHT = 500;
	
	Thread thread;
	HumanPaddle p1;
	AIPaddle a1;
	Ball b1;
	
	public void init() {
		
		this.resize(WIDTH, HEIGHT);	
		this.addKeyListener(this);
		
		p1 = new HumanPaddle(1);
		a1 = new AIPaddle(2);
		b1 = new Ball();
		thread = new Thread(this);
		thread.start();
	}
	public void paint(Graphics g) {
		
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		if(b1.getX() < -10 || b1.getX() > 710) {
			g.setColor(Color.red);
			g.drawString("Game Over Man, Game Over", 350, 250);
		}
		
		p1.draw(g);
		a1.draw(g);
		b1.draw(g);
	
	}
	public void update(Graphics g) {
		
		paint(g);
	}
	
	public void run() {
		
		for(;;) {
			p1.move();
			a1.move();
			b1.move();
			b1.checkCollision(p1, p1);
			
			repaint();
			
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_UP) 
			p1.setUpAccel(true);	
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) 
			p1.setDownAccel(true);
		
	}
	public void keyReleased(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_UP) 
			p1.setUpAccel(false);
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) 
			p1.setDownAccel(false);
		
	}
	public void keyTyped(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			
		}
	}
	public VirtualTennis() {
		
	}
}
