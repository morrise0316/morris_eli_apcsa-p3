//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(0,0,50,50,0);
	}

	public Alien(int x, int y)
	{
		this(x,y,0);
		
	}

	public Alien(int x, int y, int s)
	{
		this(x,y,30,30,s);
	
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			
			image = ImageIO.read(new File("C:\\Users\\Eli Morris\\eclipse-workspace\\Unit 17\\src\\images\\alien.jpg"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

   public void move(String direction)
	{
	   switch(direction)
	   {
	   case("DOWN"):
		   if(getY() + speed <490) setY(getY()+1); 
	   		break;
	   case("RIGHT"):
		   if(getX() + speed < 750) setX(getX()+speed); 
	   		break;
	   case("LEFT"):
		   if(getX() - speed > 0) setX(getX()-speed);
	   		break;
	   }
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return "";
	}
}
