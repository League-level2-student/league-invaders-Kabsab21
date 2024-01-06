import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {

	
	public final int MENU = 0;
	public final int GAME = 1;
	public final int END = 2;
	int currentState = 0;
	Font TitleFont = new Font("Arial", Font.PLAIN, 30);
	Font TextFont = new Font("Arial", Font.PLAIN, 20);
	
	
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
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
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
			
		    if (currentState == END) {
		        currentState = MENU;   
		    }else {
		        currentState++;
		    }
			
		}
		repaint();

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(currentState == 0){
		    updateMenuState();
		    
		    //System.out.println("action  "+currentState);
		}else if(currentState == 1){
		    updateGameState();
		 
		    //System.out.println("action "+currentState);
		}else if(currentState == 2){
		    updateEndState();
		   
		   // System.out.println("action "+currentState);
		}
		
	}

	
}
