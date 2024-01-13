import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class LeagueInvaders {

	JFrame frame = new  JFrame();
	public final static int WIDTH = 500;
	public final static int HEIGHT = 800;
	GamePanel GamePanelObject;
	
	
	public static void main(String[] args) {
		LeagueInvaders vadors = new LeagueInvaders();
		vadors.setup();

	}
	
	public void setup() {
		
		
		GamePanelObject = new GamePanel();
		frame.add(GamePanelObject);
		frame.addKeyListener(GamePanelObject);
		frame.setVisible(true);
		frame.setSize(WIDTH,HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	
	
	
	
}
