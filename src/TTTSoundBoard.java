import java.awt.Toolkit;

import javax.swing.JFrame;


public class TTTSoundBoard {
	public static void main(String[] args) {
		GUI gui = new GUI();
		gui.setTitle("Nyah 2.0");
		gui.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("cool_20.png")));
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.pack();
		gui.setVisible(true);
	}
}
