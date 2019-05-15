//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(300,200,50,50,2);
	}

	public Ship(int x, int y)
	{
	   this(x,y,50,50,2);
	}

	public Ship(int x, int y, int s)
	{
	   this(x,y,50,50,s);
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			//URL url = getClass().getResource();
			image = ImageIO.read(new File("C:\\Users\\Eli Morris\\eclipse-workspace\\Unit 17\\src\\images\\ship.jpg"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


	public void setSpeed(int s)
	{
	   //add more code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
		//add code here
		switch(direction) {
		case("LEFT"):
			if(getX() - speed > 0) setX(getX()-speed);
			
			break;
		case("RIGHT"):
			if(getX() + speed < 750) setX(getX()+speed); 
			
			break;
		case("UP"):
			if(getY() - speed > 0) setY(getY()-speed); 
			
			break;
		case("DOWN"):
			if(getY() + speed <490) setY(getY()+speed); 
			
			break;
		
		}
		
		
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
