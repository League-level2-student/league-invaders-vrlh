import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer timer;
//GameObject gameObject;
final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState = MENU_STATE;

Font titleFont;
Font enterFont;
Font spaceFont;

Font endFont;
Font killFont;
Font restartFont;

Rocketship rocketship = new Rocketship(250, 700, 50, 50);

GamePanel(){
	timer = new Timer(1000 / 60, this);
	//gameObject = new GameObject(10, 10, 100, 100);
	
	titleFont = new Font("Arial", Font.PLAIN, 48);
	enterFont = new Font("Arial", Font.PLAIN, 30);
	spaceFont = new Font("Arial", Font.PLAIN, 30);
	
	endFont = new Font("Arial", Font.PLAIN, 48);
	killFont = new Font("Arial", Font.PLAIN, 30);
	restartFont = new Font("Arial", Font.PLAIN, 30);
}void startgame(){
	timer.start();
}
void updateMenuState() {
	
}
void updateGameState() {
	rocketship.update();
}
void updateEndState() {
	
}
void drawMenuState(Graphics g) {
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
	
	g.setFont(titleFont);
	g.setColor(Color.WHITE);
	g.drawString("LEAGUE INVADERS", 25, 200);
	
	g.setFont(enterFont);
	g.setColor(Color.WHITE);
	g.drawString("Press ENTER to start", 100, 350);
	
	g.setFont(spaceFont);
	g.setColor(Color.WHITE);
	g.drawString("Press SPACE for instructions", 60, 500);
	
	
}
void drawGameState(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
	
	rocketship.draw(g);
}
void drawEndState(Graphics g) {
	g.setColor(Color.RED);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
	
	g.setFont(endFont);
	g.setColor(Color.BLACK);
	g.drawString("GAME OVER", 100, 200);
	
	g.setFont(killFont);
	g.setColor(Color.BLACK);
	g.drawString("You killed 0 enemies", 100, 350);
	
	g.setFont(restartFont);
	g.setColor(Color.BLACK);
	g.drawString("Press ENTER to restart", 80, 500);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	repaint();
	//gameObject.update();
	repaint();
	 if(currentState == MENU_STATE){
         updateMenuState();
 }else if(currentState == GAME_STATE){
         updateGameState();
 }else if(currentState == END_STATE){
         updateEndState();
 }


}
@Override

public void paintComponent(Graphics g){
	 g.fillRect(10, 10, 100, 100);
	// gameObject.draw(g);
	 if(currentState == MENU_STATE){
         drawMenuState(g);
 }else if(currentState == GAME_STATE){
         drawGameState(g);
 }else if(currentState == END_STATE){
        drawEndState(g);
 }
        }
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("What what?");
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Something");
	if(e.getKeyCode() == KeyEvent.VK_ENTER) {
		currentState++;
		if(currentState > END_STATE){

            currentState = MENU_STATE;

		}
	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Hi");
	
}
}
