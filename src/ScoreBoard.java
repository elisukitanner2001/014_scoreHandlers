import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScoreBoard implements ActionListener{
	int homeScoreAmount = 0;
	int visitorScoreAmount = 0;
	
	JPanel titlePanel, scorePanel, buttonPanel;
	JLabel homeLabel, visitorLabel, homeScore, visitorScore;
	JButton resetButton;
	JButton addOneHome, addTwoHome, addThreeHome, addsixHome, minusOnehome;
	JButton addOnevisitor, addTwovisitor, addThreevisitor, addsixvisitor, minusOnevisitor;
	
	

	public Container createContentPane() {
		JPanel totalGUI = new JPanel();
		totalGUI.setSize(400,300);
		totalGUI.setLayout(null);
		titlePanel = new JPanel();
		titlePanel.setLayout(null);
		titlePanel.setLocation(10,10);
		titlePanel.setSize(330,30);
		titlePanel.setBackground(Color.BLUE);
		totalGUI.add(titlePanel);
		
		homeLabel = new JLabel("home Team");
		homeLabel.setLocation(0,0);
		homeLabel.setFont(new Font("MathJax_Typewriter", Font.ITALIC, 20));
		homeLabel.setSize(200,30);
		homeLabel.setHorizontalAlignment(0);
		homeLabel.setForeground(Color.RED);
		titlePanel.add(homeLabel);
		
		visitorLabel = new JLabel("visitor Team");
		visitorLabel.setLocation(160,0);
		visitorLabel.setFont(new Font("MathJax_Typewriter", Font.ITALIC, 20));
		visitorLabel.setSize(200,30);
		visitorLabel.setHorizontalAlignment(0);
		visitorLabel.setForeground(Color.RED);
		titlePanel.add(visitorLabel);
		
		scorePanel = new JPanel();
		scorePanel.setBackground(Color.pink);
		scorePanel.setLayout(null);
		scorePanel.setLocation(10,50);
		scorePanel.setSize(330, 30);
		totalGUI.add(scorePanel);
		
		homeScore = new JLabel("" +homeScoreAmount);
		homeScore.setLocation(0,0);
		homeScore.setSize(200,30);
		homeScore.setHorizontalAlignment(0);
		scorePanel.add(homeScore);
		
		visitorScore = new JLabel("" +visitorScoreAmount);
		visitorScore.setLocation(130,0);
		visitorScore.setSize(200,30);
		visitorScore.setHorizontalAlignment(0);
		scorePanel.add(visitorScore);
		
		buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.ORANGE);
		buttonPanel.setLayout(null);
		buttonPanel.setLocation(10,90);
		buttonPanel.setSize(330, 210);
		totalGUI.add(buttonPanel);
		
		addOneHome = new JButton("PAT");
		addOneHome.setLocation(0, 0);
		addOneHome.setSize(160, 30);
		addOneHome.addActionListener(this); 
		buttonPanel.add(addOneHome);
		
		addTwoHome = new JButton("Safety/Conversion");
		addTwoHome.setLocation(0, 35);
		addTwoHome.setSize(160, 30);
		addTwoHome.addActionListener(this); 
		buttonPanel.add(addTwoHome);
		
		addThreeHome = new JButton("Field Goal");
		addThreeHome.setLocation(0, 70);
		addThreeHome.setSize(160, 30);
		addThreeHome.addActionListener(this); 
		buttonPanel.add(addThreeHome);
		
		addsixHome = new JButton("TouchDown!");
		addsixHome.setLocation(0, 105);
		addsixHome.setSize(160, 30);
		addsixHome.addActionListener(this); 
		buttonPanel.add(addsixHome);
		
		minusOnehome = new JButton("Flags :-(");
		minusOnehome.setLocation(0, 140);
		minusOnehome.setSize(160, 30);
		minusOnehome.addActionListener(this); 
		buttonPanel.add(minusOnehome);
		
		addOnevisitor = new JButton("PAT");
		addOnevisitor.setLocation(170, 0);
		addOnevisitor.setSize(160, 30);
		addOnevisitor.addActionListener(this); 
		buttonPanel.add(addOnevisitor);
		
		addTwovisitor = new JButton("Safety/Conversion");
		addTwovisitor.setLocation(170, 35);
		addTwovisitor.setSize(160, 30);
		addTwovisitor.addActionListener(this); 
		buttonPanel.add(addTwovisitor);
		
		addThreevisitor = new JButton("Field Goal");
		addThreevisitor.setLocation(170, 70);
		addThreevisitor.setSize(160, 30);
		addThreevisitor.addActionListener(this); 
		buttonPanel.add(addThreevisitor);
		
		addsixvisitor = new JButton("TouchDown!");
		addsixvisitor.setLocation(170, 105);
		addsixvisitor.setSize(160, 30);
		addsixvisitor.addActionListener(this); 
		buttonPanel.add(addsixvisitor);
		
		minusOnevisitor = new JButton("Flags :-(");
		minusOnevisitor.setLocation(170, 140);
		minusOnevisitor.setSize(160, 30);
		minusOnevisitor.addActionListener(this); 
		buttonPanel.add(minusOnevisitor);
		
		resetButton = new JButton("Start New Game");
		resetButton.setLocation(0, 175);
		resetButton.setSize(330, 30);
		resetButton.addActionListener(this); 
		buttonPanel.add(resetButton);
		
		
		return totalGUI;
		
		
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addOneHome) {
			homeScoreAmount = homeScoreAmount +1;
			homeScore.setText("" + homeScoreAmount);	
		} else if (e.getSource() == addOnevisitor) {
			visitorScoreAmount = visitorScoreAmount +1;
			visitorScore.setText("" + visitorScoreAmount);	
			
		
		}if (e.getSource() == addTwoHome) {
			homeScoreAmount = homeScoreAmount +2;
			homeScore.setText("" + homeScoreAmount);	
		} else if (e.getSource() == addTwovisitor) {
			visitorScoreAmount = visitorScoreAmount +2;
			visitorScore.setText("" + visitorScoreAmount);
		} else if (e.getSource() == addThreeHome) {
			homeScoreAmount = homeScoreAmount +3;
			homeScore.setText("" + homeScoreAmount);
		} else if (e.getSource() == addsixHome) {
			homeScoreAmount = homeScoreAmount +6;
			homeScore.setText("" + homeScoreAmount);
		}else if (e.getSource() == minusOnehome) {
			homeScoreAmount = homeScoreAmount -1;
			homeScore.setText("" + homeScoreAmount);
		}else if (e.getSource() == addThreevisitor) {
			visitorScoreAmount = visitorScoreAmount +3;
			visitorScore.setText("" + visitorScoreAmount);
		} else if (e.getSource() == addsixvisitor) {
			visitorScoreAmount = visitorScoreAmount +6;
			visitorScore.setText("" + visitorScoreAmount);
		}else if (e.getSource() == minusOnevisitor) {
			visitorScoreAmount = visitorScoreAmount -1;
			visitorScore.setText("" + visitorScoreAmount);
		}
		
		
		
		
		
		else if (e.getSource() == resetButton) {
			homeScoreAmount=0;
			visitorScoreAmount=0;
			homeScore.setText("" + homeScoreAmount);
			visitorScore.setText("" + visitorScoreAmount);
		}
	}

}
