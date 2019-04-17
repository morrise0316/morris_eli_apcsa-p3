//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Canvas;

public class BlockTestTwo extends Canvas
{
	public BlockTestTwo()
	{
		setBackground(Color.WHITE);
	}

	public void paint(Graphics window)
	{
		Block one = new Block();
		one.draw(window);

		Block two = new Block(150,150,90,90);
		two.draw(window);

		Block three = new Block(1050,1050,45,45,Color.RED);
		three.draw(window);

		//two.draw(window, Color.white);

		Block four = new Block(1350,150,60,180, Color.GREEN);
		four.draw(window);
		
		//add more test cases			
	}
}