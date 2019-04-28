import java.awt.Color;
import java.awt.Graphics;

public class Projectiles extends GameObject{
int speed = 10;
	Projectiles(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	void update() {
		y = y-speed;
		if (y<0) {
			isAlive = false;
		}
		System.out.println("Tyler says Hi");
			}
	void draw(Graphics g) {
		  g.setColor(Color.RED);
	      g.fillRect(x, y, width, height);
	}
}
