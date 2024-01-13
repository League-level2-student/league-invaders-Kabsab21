import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject {

	 RocketShip( int x, int y, int width, int height){ 
		 super(x,y,width,height);
		 speed = 10;
	 }
	 
	 void draw(Graphics g) {
	     g.setColor(Color.BLUE);
	        g.fillRect(x, y, width, height);
	 }
	 
	 void up() {
		  y-=speed;
		  if( y >  800 ) {
			  y = 0;
		  }
		  if( y <  0 ) {
			  y = 800;
		  }
	 }
	 void down() {
		  y+=speed;
		  if( y >  800 ) {
			  y = 0;
		  }
		  if( y <  0 ) {
			  y = 800;
		  }
	 }
	 void left() {
		  x-=speed;
		  if( x > 500 ) {
			  x = 0;
		  }
		  if( x <  0 ) {
			  x = 500;
		  }
	 }
	 void right() {
		  x+=speed;
		  
		  if( x > 500 ) {
			  x = 0;
		  }
		  if( x <  0 ) {
			  x = 500;
		  }
	 }
}
