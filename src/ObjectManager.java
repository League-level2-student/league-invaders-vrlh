import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
Rocketship rocketship;
ArrayList<Projectiles> projectile = new ArrayList<>();
ObjectManager(Rocketship rocketShip){
	rocketship = rocketShip;
}
void update() {
	rocketship.update();
	System.out.println("PROJECTILE SIZE: " + projectile.size());
	for(int i = 0; i < projectile.size(); i++) {
		projectile.get(i).update();
	}
}
void draw(Graphics g) {
rocketship.draw(g);
for(int i = 0; i < projectile.size(); i++) {
	projectile.get(i).draw(g);
}
}
void addProjectile(Projectiles Projectile) {
	projectile.add(Projectile);
}

}
