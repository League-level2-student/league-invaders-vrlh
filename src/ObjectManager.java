import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
Rocketship rocketship;
ArrayList<Projectiles> projectile = new ArrayList<>();
ObjectManager(Rocketship rocketShip){
	rocketship = rocketShip;
}

ArrayList<Alien> alien = new ArrayList<>();

long enemyTimer = 0;
int enemySpawnTime = 1000;


void update() {
	rocketship.update();
	//System.out.println("PROJECTILE SIZE: " + projectile.size());
	for(int i = 0; i < projectile.size(); i++) {
		projectile.get(i).update();
	}
	for(int i = 0; i < alien.size(); i++) {
		alien.get(i).update();
	}

}
void draw(Graphics g) {
rocketship.draw(g);
for(int i = 0; i < projectile.size(); i++) {
	projectile.get(i).draw(g);
}
for(int i = 0; i < alien.size(); i++) {
	alien.get(i).draw(g);
}
}
void addProjectile(Projectiles Projectile) {
	projectile.add(Projectile);
}
void addAlien(Alien alien){
	this.alien.add(alien);
}
public void manageEnemies(){
    if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
            addAlien(new Alien(new Random().nextInt(LeagueInvaders.width), 0, 50, 50));

enemyTimer = System.currentTimeMillis();
    }
}
void purgeObjects() {
	for(int i = 0; i < alien.size(); i++) {
		if(alien.get(i).height > LeagueInvaders.height) {
			alien.remove(i);
		}
	}
}
void checkCollision() {
	for (Alien a : alien) {
		 if(rocketship.collisionBox.intersects(a.collisionBox)){
             rocketship.isAlive = false;
             System.out.println("Tyler said to this and its in checkCollision in ObjectManager");
     }
		if() {
			
		}
	}
	
}


}
