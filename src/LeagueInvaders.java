import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class LeagueInvaders extends GamePanel implements ActionListener{

	JFrame frame = new  JFrame();
	public final static int WIDTH = 500;
	public final static int HEIGHT = 800;
	GamePanel GamePanelObject;
	Timer frameDraw = new Timer(1000/60,(ActionListener) this);
	
	public static void main(String[] args) {
		LeagueInvaders vadors = new LeagueInvaders();
		vadors.setup();
	}
	
	public void setup() {
	//	frameDraw.start();
		GamePanelObject = new GamePanel();
		frame.add(GamePanelObject);
		frame.addKeyListener(this);
		frame.setVisible(true);
		frame.setSize(WIDTH,HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		if(currentState == MENU){
		    updateMenuState();
		    System.out.println("action");
		}else if(currentState == GAME){
		    updateGameState();
		    System.out.println("action");
		}else if(currentState == END){
		    updateEndState();
		    System.out.println("action");
		}
	}
	
	
	
}
