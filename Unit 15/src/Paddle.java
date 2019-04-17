//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(30,570,60,240);
      speed =15;
   }


   //add the other Paddle constructors

   public Paddle(int x, int y)
   {
	   super(x,y);
	   speed =15;
   }
   
  public Paddle(int x, int y, int speed)
  {
	   super(x,y);
	   this.speed = speed;
  }
   
  public Paddle(int x, int y, int width, int height)
  {
	  super(x,y,width,height);
	  speed = 15;
  }
  
  public Paddle(int x, int y, int width, int height, int speed)
  {
	  super(x,y,width,height);
	  this.speed = speed;
  }
  
  public Paddle(int x, int y, int width, int height, Color color)
  {
	  super(x,y,width,height,color);
	  speed = 15;
  }

  public Paddle(int x, int y, int width, int height, Color color, int speed)
  {
	  super(x,y,width,height,color);
	  this.speed = speed;
  }


  public void setSpeed(int s)
  {
	  speed = s;
  }



   public void moveUpAndDraw(Graphics window)
   {
	  draw(window,Color.WHITE);
	   
	  setY(getY() - speed);
	   
	  draw(window,getColor());
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window,Color.WHITE);
	   
	   setY(getY() + speed);
	   
	   draw(window,getColor());

   }

   //add get methods
   //we already have all of the get methods except for the getSpeed in the superclass
   public int getSpeed()
   {
	   return speed;
   }
   
   //add a toString() method
   public String toString()
   {
	   return super.toString() + " " + speed;
   }
}