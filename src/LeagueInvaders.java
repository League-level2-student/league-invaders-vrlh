import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	GamePanel gamePanel;
	static int width;
	static int height;
public static void main(String[] args) {
	LeagueInvaders l = new LeagueInvaders();
	l.setUp();
}
LeagueInvaders(){
	gamePanel = new GamePanel();
}
void setUp() {
	frame = new JFrame();
	frame.add(gamePanel);
	frame.setVisible(true);
	frame.addKeyListener(gamePanel);
	width = 500;
	height = 800;
	frame.setSize(width, height);
	frame.getContentPane().setPreferredSize(new Dimension(width, height));

    frame.pack();
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 gamePanel.startgame();
}
}
