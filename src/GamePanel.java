import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{

	Font titleFont;
	Font enterFont;
	Font spaceFont;
	Font gameoverFont;
    final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
    int currentState = MENU;
    Timer frameDraw;
    Rocketship rocketship = new Rocketship(250,700,50,50);
    
    void updateMenuState() { 
    	
    }
    void updateGameState() { 
    	rocketship.update();
    }
    void updateEndState()  { 
    	
    }
    void drawMenuState(Graphics g) { 
	
    	g.setColor(Color.DARK_GRAY);
    	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
    	
    	g.setFont(titleFont);
    	g.setColor(Color.YELLOW);
    	g.drawString("League Invaders", 60, 200);
    	
    	g.setFont(enterFont);
    	g.setColor(Color.YELLOW);
    	g.drawString("Press ENTER to start", 100, 400);
    	
    	g.setFont(spaceFont);
    	g.setColor(Color.YELLOW);
    	g.drawString(" Press SPACE for instructions", 50, 500);
    	
    }
    void drawGameState(Graphics g) { 
    	g.setColor(Color.BLACK);
    	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
    	rocketship.draw(g);
    }
    void drawEndState(Graphics g)  { 
	
    	g.setColor(Color.RED);
    	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
    	
    }
	GamePanel(){
		setPreferredSize(new Dimension(LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT));
		 titleFont = new Font("Arial", Font.PLAIN, 48);
		 gameoverFont = new Font("Arial", Font.PLAIN, 50);
		 enterFont = new Font("Arial", Font.PLAIN, 30);
		 spaceFont = new Font("Arial", Font.PLAIN, 30);
		 frameDraw = new Timer(1000/60,this);
		 frameDraw.start();
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
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(currentState == MENU){
	    updateMenuState();
	}else if(currentState == GAME){
	    updateGameState();
	}else if(currentState == END){
	    updateEndState();
	}
	System.out.println("Action");
	repaint();
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
	    } else {
	        currentState++;
	    }
	}  
	
	if (e.getKeyCode()==KeyEvent.VK_UP) {
	    System.out.println("UP");
	    rocketship.up = true;
	}if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
	    System.out.println("RIGHT");
	    rocketship.right = true; 
	}if (e.getKeyCode()==KeyEvent.VK_DOWN) {
	    System.out.println("DOWN");
	    rocketship.down = true; 
	}if (e.getKeyCode()==KeyEvent.VK_LEFT) {
	    System.out.println("LEFT");
	    rocketship.left = true; 
	}
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	if (e.getKeyCode()==KeyEvent.VK_UP) {
	    System.out.println("UP");
	    rocketship.up = false;
	}
	if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
	    System.out.println("RIGHT");
	    rocketship.right = false;
	}
	if (e.getKeyCode()==KeyEvent.VK_DOWN) {
	    System.out.println("DOWN");
	    rocketship.down = false;
	}
	if (e.getKeyCode()==KeyEvent.VK_LEFT) {
	    System.out.println("LEFT");
	    rocketship.left = false; 	
}
}}
