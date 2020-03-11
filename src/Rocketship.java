import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{
	boolean up = false;
	boolean down = false;
	boolean left = false;
	boolean right = false;
	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		
		this.speed = speed;
		speed = 10;
		
	}
	void draw(Graphics g) {
		 g.setColor(Color.BLUE);
	     g.fillRect(x, y, width, height);
	}
void update(){
		if(up == true) {
			up();
		}
		if(down == true) {
			down();
		}
		if(left == true) {
			left();
		}
		if(right == true) {
			right();
		}
	}
	 public void right() {
		 x+=speed;
	     if (x > LeagueInvaders.WIDTH - width) {
	    	 x = LeagueInvaders.WIDTH - width;
		}     
	    }
	 public void left() {
		 x-=speed;
	     if (x < 0) {
	    	 x = 0; 	
		} 
	    }
	 public void up() {
		 y-=speed;
	     if (y < 0) {
	    	 y = 0;
		}
	    }
	 public void down() {
		 y+=speed;
	     if (y > LeagueInvaders.HEIGHT - height) {
	    	 y = LeagueInvaders.HEIGHT - height;
		}   
	    }
}
