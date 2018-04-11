import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel {
	public Image fondo;	
	public Panel(){
		
		preInit();
		initComponents();
		
	}

	private void initComponents() {		
	}

	private void preInit() {	
		fondo = new ImageIcon("fondo2.png").getImage();
	}
	
	public void paint(Graphics g) {
		g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
		
	}

}
