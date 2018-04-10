import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.Graphics;
import javax.imageio.ImageIO;

public class Main {

	public static void main(String[] args) throws IOException {
		Frame window = new Frame("Invaders");
		window.setVisible(true);
		window.setSize(1000, 700);
		window.setLocation(180, 30);
		
		
		Label player = new Label();
		player.setBounds(2, 2, 2, 2);
		player.setText("hola");
		window.add(player);
	}

}
