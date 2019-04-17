//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.awt.event.ActionListener;


public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int rightScore;
	private int leftScore;
	Random r = new Random();
	private int initXSpd;
	private int initYSpd;

	public Pong()
	{
		//set up all variables related to the game
		ball = new SpeedUpBall();
		initXSpd  = ball.getXSpeed();
		initYSpd = ball.getYSpeed();
		ball.setColor(Color.BLUE);
		ball.setSpeed(5,5);
	
		leftPaddle = new Paddle(120,570,60,240);
		rightPaddle = new Paddle(2050,570,60,240);
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


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);


		//see if ball hits left wall or right wall
		if(!(ball.getX()>=30 && ball.getX()<=2100))
		{
			
			
			if(ball.getX() <= 200)
				rightScore++;
			else
				leftScore++;
			
			Color oldColor = new Color(ball.getColor().getRGB());
			ball.draw(graphToBack,Color.WHITE);
			
			ball.setXSpeed(initXSpd -1);
			ball.setYSpeed(initYSpd -1);
			
			ball.setX(1070 + r.nextInt(400));
			ball.setY(510 + r.nextInt(240));
			
			ball.draw(graphToBack,oldColor);
		}

		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=30 && ball.getY()<=1350))
		{
			ball.setYSpeed(-ball.getYSpeed());
			
		}



		//see if the ball hits the left paddle
		
		   if(  (ball.getX() <=  leftPaddle.getX() +leftPaddle.getWidth() + Math.abs(ball.getXSpeed()))
         &&
         ( ball.getY() >= leftPaddle.getY() &&
         ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight()  ||
         ball.getY() + ball.getHeight() >= leftPaddle.getY() &&
         ball.getY() + ball.getHeight()  < leftPaddle.getY() + leftPaddle.getHeight() )  )
			{
			   if(  ball.getX()   <=   leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed()) )
			       ball.setYSpeed(-ball.getYSpeed());
			   else
			       ball.setXSpeed(-ball.getXSpeed());
			} 
		//see if the ball hits the right paddle
		   if(  (ball.getX() >=  rightPaddle.getX()  - Math.abs(ball.getXSpeed()))
			         &&
			         ( ball.getY() >= rightPaddle.getY() &&
			         ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight()  ||
			         ball.getY() + ball.getHeight() >= rightPaddle.getY() &&
			         ball.getY() + ball.getHeight()  < rightPaddle.getY() + rightPaddle.getHeight() )  )
						{
						   if(  ball.getX()   <=   rightPaddle.getX() )
						       ball.setYSpeed(-ball.getYSpeed());
						   else
						       ball.setXSpeed(-ball.getXSpeed());
						}
		//see if the paddles need to be moved
		if(keys[0] == true && leftPaddle.getY() > 0)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true && leftPaddle.getY() < 1130)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(graphToBack);

		}
		if(keys[2] == true && rightPaddle.getY() > 0)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true && rightPaddle.getY() < 1130)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		
		
		
		
		graphToBack.setFont(getFont().deriveFont(40f));
		graphToBack.setColor(Color.WHITE);
		graphToBack.drawString("Right Score: " + (rightScore-1),1000,1450);
		
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("Right Score: " + rightScore,1000,1450);

		graphToBack.setColor(Color.WHITE);
		graphToBack.drawString("Left Score: " + (leftScore-1),1010,1600);
		
		graphToBack.setColor(Color.RED);
		graphToBack.drawString("Left Score: " + leftScore,1010,1600);










		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
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