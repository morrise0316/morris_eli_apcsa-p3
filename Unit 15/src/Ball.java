//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(600,600);
		xSpeed = 9;
		ySpeed = 3;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y)
	{
		super(x,y);
		xSpeed = 9;
		ySpeed = 3;
	}
	
	public Ball(int x, int y, int width, int height)
	{
		super(x,y,width,height);
		xSpeed = 9;
		ySpeed = 3;
	}
	
	public Ball(int x, int y, int width, int height, Color color)
	{
		super(x,y,width,height,color);
		xSpeed = 9;
		ySpeed = 3;
	}
	
	public Ball(int x, int y, int width, int height, Color color, int xSpeed, int ySpeed)
	{
		super(x,y,width,height,color);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	
	
	
	
	
	
	
	
	   
   //add the set methods
   //we already have most set methods in Block except for the speeds
	public void setSpeed(int xSpeed , int ySpeed)
	{
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public void setXSpeed(int xSpeed)
	{
		this.xSpeed = xSpeed;
	}
	
	public void setYSpeed(int ySpeed)
	{
		this.ySpeed = ySpeed;
	}
   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	 draw(window,Color.WHITE);

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
     draw(window,getColor());
   }
   
	public boolean equals(Object obj)
	{
		Ball b =(Ball) obj;
		return super.equals(b) && xSpeed == b.getXSpeed() && ySpeed == b.getYSpeed();
	}   

   //add the get methods
	// we only need the get Speed methods
	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}

   //add a toString() method
	public String toString()
	{
		return super.toString() + "  " + xSpeed + " " + ySpeed;
	}
}