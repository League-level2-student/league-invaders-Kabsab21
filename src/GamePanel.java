import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {

	
	public final int MENU = 0;
	public final int GAME = 1;
	public final int END = 2;
	int currentState = 0;
	Font TitleFont = new Font("Arial", Font.PLAIN, 30);
	Font TextFont = new Font("Arial", Font.PLAIN, 20);
	Timer frameDraw ;
	RocketShip ship = new RocketShip(250,700, 50, 50);
	ObjectManager object = new ObjectManager(ship);
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	Timer alienSpawn;
	
	void startGame(){
		
	}
	
	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}
	
	GamePanel(){
		frameDraw = new Timer(1000/60,this);
	    frameDraw.start();
	    if (needImage) {
	        loadImage ("space.png");
	    }
	}
	
	@Override
	public void paintComponent(Graphics g){
		if(currentState == MENU){
		    drawMenuState(g);
		}else if(currentState == GAME){
		    drawGameState(g);
		}else if(currentState == END){
		    drawEndState(g);
		}
	}
	
	void updateMenuState( ) { 
		currentState = MENU;
		
	}
	void updateGameState() {  
		currentState = GAME;
		object.update();
	}
	void updateEndState()  { 
		currentState = END;

	}
	void drawMenuState(Graphics g) { 
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(TitleFont);
		g.setColor(Color.YELLOW);
		g.drawString("LEAGUE INVADORS", 100, 100);
		g.setFont(TextFont);
		g.drawString("Press enter to start", 150, 300);
		g.drawString("space for instructions", 150, 400);
	}
	void drawGameState(Graphics g) { 
		if (gotImage) {
			g.drawImage(image, 0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT, null);
		} else {
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		}
		object.draw(g);
	}
	void drawEndState(Graphics g)  {  
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			System.out.println("pressed enter");
		    if (currentState == END) {
		        currentState = MENU;   
		    }else {
		        currentState++;
		    }
			
		}
		if (e.getKeyCode()==KeyEvent.VK_UP) {
			ship.up();
		}
		if (e.getKeyCode()==KeyEvent.VK_DOWN) {
			ship.down();
		}
		if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			ship.left();
		}
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			ship.right();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(currentState == MENU){
		    updateMenuState();
		    
		    //System.out.println("action  "+currentState);
		}else if(currentState == GAME){
		    updateGameState();
		    
		 
		    //System.out.println("action "+currentState);
		}else if(currentState == END){
		    updateEndState();
		    
		   
		   // System.out.println("action "+currentState);
		}
		
		System.out.println("action");
		repaint();
		
	}

	
}
