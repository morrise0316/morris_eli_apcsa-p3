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
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y)
	{
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int height, int width)
	{
		super(x,y,height,width);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int height, int width, Color color)
	{
		super(x,y,height,width,color);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int height, int width, Color color, int xSpeed, int ySpeed)
	{
		super(x,y,height,width,color);
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
	  window.setColor(Color.WHITE);
	  window.fillRect(getX(), getY(), getWidth(), getHeight());

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      window.setColor(getColor());
      window.fillRect(getX(), getY(), getWidth(), getHeight());
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