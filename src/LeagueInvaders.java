import javax.swing.JFrame;

public class LeagueInvaders {

	JFrame jframe;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	GamePanel gamepanel;
	
	LeagueInvaders(){
		
	jframe = new JFrame();
	gamepanel = new GamePanel();
		
	}
	
	public static void main(String[] args) {
		
	LeagueInvaders iv = new LeagueInvaders();
	iv.Setup();
		
	}
	
	void Setup(){
	
	jframe.add(gamepanel);
	jframe.setSize(WIDTH, HEIGHT);
	jframe.setVisible(true);
	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}
