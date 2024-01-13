import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
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
//step 5 of model management 
void update() {
	
}
}
