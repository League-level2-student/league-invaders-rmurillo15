import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{

	Font titleFont;
	Font enterFont;
	Font spaceFont;
	Font gameoverFont;
    final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
    int currentState = MENU;
    Timer frameDraw;
    
    void updateMenuState() { 
    	
    }
    void updateGameState() { 
    	
    }
    void updateEndState()  { 
    	
    }
    void drawMenuState(Graphics g) { 
	
    	g.setColor(Color.BLACK);
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
	
    }
    void drawEndState(Graphics g)  { 
	
    	
    	
    }
	GamePanel(){
		
		 titleFont = new Font("Arial", Font.PLAIN, 48);
		 gameoverFont = new Font("Arial", Font.PLAIN, 50);
		 enterFont = new Font("Arial", Font.PLAIN, 30);
		 spaceFont = new Font("Arial", Font.PLAIN, 30);
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
	
}

		
}
