import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener{
RocketShip rocket ;
ArrayList projectiles = new  <Projectile>ArrayList();
 ArrayList aliens = new  <Alien>ArrayList();
Random random = new Random();

ObjectManager(RocketShip rocket){
	this.rocket = rocket;
}

void addProjectile(Projectile obj) {
	
}
void addAlien() {
aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH),0,50,50));
}

void kindaneedmetyhodIguess(Graphics g) {
for( int i = aliens.size()-1; i > 0; i-- ) {
	Alien ij = (Alien) aliens.get(i);
	ij.update();
	if( ij.y > LeagueInvaders.HEIGHT ) {
		ij.isActive = false;
	}
	
	ij.draw(g);
}

for( int i = projectiles.size()-1; i > 0; i-- ) {
	Projectile ij = (Projectile) projectiles.get(i);
	ij.update();
	if( ij.y > LeagueInvaders.HEIGHT ) {
		ij.isActive = false;
	}
	ij.draw(g);
	}
}



void update() {
	
}

 void draw(Graphics g){
	 rocket.draw(g);
}
 
 void purgeObjects() {
	 for( int i = projectiles.size()-1; i > 0; i-- ) {
			Projectile ij = (Projectile) projectiles.get(i);
			if( ij.isActive == false) {
			projectiles.remove(i);
			}			
		} 
	 for( int i = aliens.size()-1; i > 0; i-- ) {
			Alien ij = (Alien) aliens.get(i);
			if( ij.isActive == false) {
			aliens.remove(i);
			}			
		} 
 }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	addAlien();
}
 
}
