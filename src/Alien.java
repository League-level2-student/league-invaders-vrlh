import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject {

	Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	void update() {
		super.update();
		y=y+5;
	}
	void draw(Graphics g) {
		  g.setColor(Color.YELLOW);
		  g.drawImage(GamePanel.alienImg, x, y, width, height, null);
	}
}
