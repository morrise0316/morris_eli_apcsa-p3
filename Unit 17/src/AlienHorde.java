//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private List<Boolean> moveRight;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		int xPos = 0;
		for (int x = 0; x < size; x++)
		{
			add(new Alien(20 + xPos,20));
			xPos += 90;
		}
		moveRight = new ArrayList<Boolean>();
		for (Alien a : aliens)
		{
			moveRight.add(true);
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (int i = 0; i < aliens.size(); i++)
			aliens.get(i).draw(window);
	}

	public void moveEmAll()
	{
		for(int i = 0; i < aliens.size(); i++)
		{
			if (aliens.get(i).getX() + aliens.get(i).getWidth() + aliens.get(i).getSpeed() > 750)
			{
				moveRight.set(i, false);
				aliens.get(i).move("DOWN");
			}
			if(aliens.get(i).getX() - aliens.get(i).getSpeed() < 0)
			{
				moveRight.set(i, true);
				aliens.get(i).move("DOWN");
			}
			if(moveRight.get(i).booleanValue() == true)
				aliens.get(i).move("RIGHT");
			else
				aliens.get(i).move("LEFT");
		}

	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (int j = 0; j < shots.size(); j++)
			for(int k = 0; k < aliens.size(); k++)
			{
				if(shots.get(j).getY() - shots.get(j).getSpeed() <= aliens.get(k).getY() + aliens.get(k).getHeight()
						&& shots.get(j).getX() >= aliens.get(k).getX()  && 
						shots.get(j).getX() + shots.get(j).getWidth() <= aliens.get(k).getX() + aliens.get(k).getWidth())
				{
					aliens.remove(k);
					moveRight.remove(k);
				}
			}
		
	}

	public String toString()
	{
		return "";
	}
}
