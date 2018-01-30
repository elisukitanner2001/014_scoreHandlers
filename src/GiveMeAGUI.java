import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GiveMeAGUI {
	
	public  void createAndShowGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Score Board");
		
		ScoreBoard demo = new ScoreBoard();
		frame.setContentPane(demo.createContentPane());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(360, 350);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		
		
	}

}
