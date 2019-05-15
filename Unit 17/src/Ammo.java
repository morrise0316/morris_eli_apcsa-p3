//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		this(x,y,0);
	}

	public Ammo(int x, int y, int s)
	{
		super(x,y);
		speed = s;
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		Color initColor = window.getColor();
		window.setColor(Color.YELLOW);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
		window.setColor(initColor);
		
	}
	
	public void clearAmmo (Graphics window)
	{
		window.setColor(Color.BLACK);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void move( String direction )
	{
		if (direction.equals("UP"))
		{
			if(getY() - speed > 0)
				setY(getY() - speed);
			
		}
	}

	public String toString()
	{
		return "";
	}
}
