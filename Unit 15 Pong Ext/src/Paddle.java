//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int Xspd;
   private int Yspd;

   public Paddle()
   {
		super(30,570,60,240);
      Xspd = 15;
      Yspd = 15;
   }


   //add the other Paddle constructors

   public Paddle(int x, int y)
   {
	   super(x,y);
	   Xspd = 15;
	   Yspd = 15;
   }
   
  public Paddle(int x, int y, int speed)
  {
	   super(x,y);
	   this.Xspd = speed;
	   this.Yspd = speed;
  }
   
  public Paddle(int x, int y, int width, int height)
  {
	  super(x,y,width,height);
	  Xspd = 15;
	  Yspd = 15;
  }
  
  public Paddle(int x, int y, int width, int height, int Xspd, int Yspd)
  {
	  super(x,y,width,height);
	  this.Xspd = Xspd;
	  this.Yspd = Yspd;
  }
  
  public Paddle(int x, int y, int width, int height, Color color, int Xspd, int Yspd)
  {
	  super(x,y,width,height,color);
	  this.Xspd = Xspd;
	  this.Yspd = Yspd;
  }

  public void setXspd(int s)
  {
	  Xspd = s;
  }
  
  public void setYspd(int s)
  {
	  Yspd = s;
  }



   public void moveUpAndDraw(Graphics window)
   {
	  draw(window,Color.WHITE);
	   
	  setY(getY() - Yspd);
	   
	  draw(window,getColor());
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window,Color.WHITE);
	   
	   setY(getY() + Yspd);
	   
	   draw(window,getColor());

   }
   
   public void moveLeftAndDraw(Graphics window)
   {
	   draw(window,Color.WHITE);
	   
	   setX(getX() - Xspd);
	   
	   draw(window,getColor());
   }
   public  void moveRightAndDraw(Graphics window)
   {
	   draw(window,Color.WHITE);
	   
	   setX(getX() + Xspd);
	   
	   draw(window,getColor());
	   
   }

   //add get methods
   //we already have all of the get methods except for the getSpeed in the superclass
   public int getXspd()
   {
	   return Xspd;
   }
   
   public int getYspd()
   {
	   return Yspd;
   }
   
   //add a toString() method
   public String toString()
   {
	   return super.toString() + " " + Xspd + " " + Yspd;
   }
}