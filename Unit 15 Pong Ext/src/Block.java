//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 300; yPos = 300; width = 30; height = 30; color = new Color(0,0,0);

	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y) 
	{
		xPos = x; yPos = y; width = 30; height = 30; color = new Color(0,0,0);
	}
	public Block(int x, int y, int width, int height)
	{
		xPos = x; yPos = y; this.width = width; this.height = height; color = new Color(0,0,0);
	}
	public Block(int x, int y, int width, int height, Color color)
	{
		xPos = x; yPos = y; this.width = width; this.height = height; this.color = new Color(color.getRGB());
	}
	
	
	
	
	
	
	
	
	
	
   //add the other set methods
   

   public void setColor(Color color)
   {
	   this.color = new Color(color.getRGB());
   }
   @Override
	public void setPos(int x, int y) 
   {
		xPos = x; yPos = y;
		
	}
	@Override
	public void setX(int x) 
	{
		xPos = x;
		
	}

	@Override
	public void setY(int y) 
	{
		yPos = y;
		
	}
	
	public void setDimensions (int height, int width)
	{
		this.height = height; this.width = width;
	}
	
	public void setHeight (int height)
	{
		this.height = height;
	}
	
	public void setWidth (int width)
	{
		this.width = width;
	}
   public void draw(Graphics window)
   {
   	
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block blc =(Block) obj;
		return xPos == blc.getX() && yPos == blc.getY() && width == blc.getWidth() && height == blc.getHeight()
				&& color.equals(blc.getColor());
	}

	

	

   //add the other get methods
	@Override
	public int getX() 
	{
		return xPos;
	}

	@Override
	public int getY() 
	{
		return yPos;
	}  
	
	public int getHeight()
	{
		return height;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public Color getColor() 
	{
		return color;
	}

   //add a toString() method  - x , y , width, height, color
	public String toString()
	{
		return "" + xPos + " " + yPos + " " + width + " " + height + " " + color;
	}
	
}