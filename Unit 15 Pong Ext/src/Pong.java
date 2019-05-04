//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.List;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionListener;


public class Pong extends Canvas implements KeyListener, Runnable
{
	private BlinkyBall ball;
	private Paddle pd;
	private ArrayList<Block> tileList;
	private boolean[] keys;
	private BufferedImage back;
	Random r = new Random();
	private int initXSpd;
	private int initYSpd;
	private int levels;

	public Pong()
	{
		//set up all variables related to the game
		ball = new BlinkyBall(1195,945,50,50,Color.BLUE,5,5);
		tileList = new ArrayList<Block>();
		initXSpd  = ball.getXSpeed();
		initYSpd = ball.getYSpeed();
		ball.setColor(Color.BLUE);
		BlockTestTwo.tileSet1(tileList);
		levels = 0;
	
		pd = new Paddle(1180,700,200,200,Color.RED,7,7);
		
		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		if(tileList.isEmpty() && levels < 1)
		{
			BlockTestTwo.tileSet1(tileList);
			levels++;
		}

		
		ball.moveAndDraw(graphToBack);
		pd.draw(graphToBack);
		for (int i = 0; i < tileList.size(); i++) tileList.get(i).draw(graphToBack);
		
		

		//see if ball hits left wall or right wall
		if(!(ball.getX()>=15 && ball.getX()<=2310))
		{
			
			ball.setXSpeed(-ball.getXSpeed());
		}

		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=40 && ball.getY()<=1650))
		{
			ball.setYSpeed(-ball.getYSpeed());
			
		}
		 
		
		for (int i = 0; i < tileList.size(); i++)
		{
			Block test = tileList.get(i);
			if(test.getX() <= ball.getX() && ball.getX()<=test.getX()+test.getWidth() && test.getY() <= ball.getY() && 
					ball.getY() <= test.getY() + test.getHeight())
			{
				tileList.get(i).draw(graphToBack, Color.WHITE);
				tileList.remove(i);
				
				ball.setXSpeed(-ball.getXSpeed());
				ball.setYSpeed(-ball.getYSpeed());
				
				
			}
		}


		//see if the ball hits the left paddle
		
		  /* if(  (ball.getX() <=  pd.getX() +pd.getWidth() + Math.abs(ball.getXSpeed()))
         &&
         ( ball.getY() >= pd.getY() &&
         ball.getY() <= pd.getY() + pd.getHeight()  ||
         ball.getY() + ball.getHeight() >= pd.getY() &&
         ball.getY() + ball.getHeight()  < pd.getY() + pd.getHeight() )  )
			{
			   if(  ball.getX()   <=   pd.getX() + pd.getWidth() - Math.abs(ball.getXSpeed()) )
			       ball.setYSpeed(-ball.getYSpeed());
			   else
			       ball.setXSpeed(-ball.getXSpeed());
			} 
		//see if the ball hits the right paddle
		   if(  (ball.getX() >=  pd.getX()  - Math.abs(ball.getXSpeed()))
			         &&
			         ( ball.getY() >= pd.getY() &&
			         ball.getY() <= pd.getY() + pd.getHeight()  ||
			         ball.getY() + ball.getHeight() >= pd.getY() &&
			         ball.getY() + ball.getHeight()  < pd.getY() + pd.getHeight() )  )
						{
						   if(  ball.getX()   <=   pd.getX() )
						       ball.setYSpeed(-ball.getYSpeed());
						   else
						       ball.setXSpeed(-ball.getXSpeed());
						} */
		if (((ball.getY() + ball.getHeight() + ball.getYSpeed() >= pd.getY() && ball.getY()+ball.getHeight()  + ball.getYSpeed()
		<= pd.getHeight()+pd.getY())) && ((ball.getX() + ball.getWidth() + ball.getXSpeed() >= pd.getX()) && ball.getX() + ball.getWidth() + ball.getXSpeed() <= pd.getX() + pd.getWidth()))
			ball.setYSpeed(-ball.getYSpeed());
		else if((ball.getY() + ball.getYSpeed() <= pd.getY() + pd.getHeight() &&  ball.getY() + ball.getYSpeed()
		>= pd.getY()) && ((ball.getX() + ball.getWidth() + ball.getXSpeed() >= pd.getX()) && ball.getX() + ball.getWidth() + ball.getXSpeed() <= pd.getX() + pd.getWidth()))
			ball.setYSpeed(-ball.getYSpeed());
		else if (((ball.getX() + ball.getWidth() + ball.getXSpeed() >= pd.getX() && ball.getX()+ball.getWidth()  + ball.getXSpeed()
		<= pd.getWidth()+pd.getX())) &&((ball.getY() + ball.getHeight() + ball.getYSpeed() >= pd.getY()) && ball.getY() + ball.getHeight() + ball.getYSpeed() <= pd.getY() + pd.getHeight()))
			ball.setXSpeed(-ball.getXSpeed());
		else if((ball.getX() + ball.getXSpeed()  <= pd.getX() + pd.getWidth() &&  + ball.getX() + ball.getXSpeed()
		>= pd.getX()) &&((ball.getY() + ball.getHeight() + ball.getYSpeed() >= pd.getY()) && ball.getY() + ball.getHeight() + ball.getYSpeed() <= pd.getY() + pd.getHeight()))
			ball.setXSpeed(-ball.getXSpeed());
		
		//see if the paddles need to be moved
		if(keys[0] == true && pd.getY() + pd.getYspd() > 40)
		{
			//move left paddle up and draw it on the window
			pd.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true && pd.getY() + pd.getYspd() < 1650)
		{
			//move left paddle down and draw it on the window
			pd.moveDownAndDraw(graphToBack);

		}
		if(keys[2] == true && pd.getX() + pd.getXspd() > 15)
		{
			pd.moveLeftAndDraw(graphToBack);
		}
		if(keys[3] == true && pd.getX() + pd.getXspd() < 2310)
		{
			pd.moveRightAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'S' : keys[1]=true; break;
			case 'A' : keys[2]=true; break;
			case 'D' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'S' : keys[1]=false; break;
			case 'A' : keys[2]=false; break;
			case 'D' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}