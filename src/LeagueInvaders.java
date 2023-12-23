import javax.swing.JFrame;

public class LeagueInvaders {

	JFrame frame = new  JFrame();
	public final static int WIDTH = 500;
	public final static int HEIGHT = 800;
	
	
	public static void main(String[] args) {
		LeagueInvaders vadors = new LeagueInvaders();
		vadors.setup();
	}
	
	public void setup() {
		frame.setVisible(true);
		frame.setSize(WIDTH,HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
