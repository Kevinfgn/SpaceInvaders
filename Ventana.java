import java.awt.Container;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	
	Panel p;
	
	public Ventana() {
		this.setBounds(0, 0, 950, 650);
		this.setTitle("Invaders");
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		Container canvas = getContentPane();
		p = new Panel();
		canvas.add(p);
	}
	
}
