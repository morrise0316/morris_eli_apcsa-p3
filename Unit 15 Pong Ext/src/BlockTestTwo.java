//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Canvas;

public class BlockTestTwo extends Canvas
{
	//private ArrayList<Block> tileList;
	public BlockTestTwo()
	{
		setBackground(Color.WHITE);
		//tileList = new ArrayList<Block>();
	}
//4 tiles per side per layer

	public static void tileSet1(ArrayList<Block> tileList)
	{
		
		int y = 50;
		int origY = y;
		int y2 = origY;
		int y3 = origY;
		int y4 = origY;
		
		int xAdd = 50;
		int xAdd2 =2200;
		int xAdd3 =2250;
		
		for (int i = 0; i < 16; i++)
		{
			
			if (i <= 3)
			{
				tileList.add(new Block(25,y,25,390,Color.GREEN)); //last ends at 1640
				y+=400;
				continue;
			}
			
		
			if(i > 3 && i<8)
			{
				tileList.add(new Block(25 + xAdd,y2,25,390,Color.GREEN));
				y2+=400;
				continue;
			}//last ends at 1640 
			if (i > 7 && i < 12)
			{
				tileList.add(new Block(25+ xAdd2,y3,25,390,Color.GREEN)); //last ends at 1640
				y3+=400;
				continue;
			}
			if(i > 11 && i < 16)
			{
				tileList.add(new Block(25 + xAdd3,y4,25,390,Color.GREEN));
				y4+=400;
				continue;
			}	
			
		}
		int x = 130;
		int x2 = 130;
		int x3 = 130;
		int x4 = 130;
		
		int addY = 50;
		int addY2 = 1515;
		int addY3 = 1565;
		for (int i = 0; i < 16; i++) //start x at 130 end at 2200
		{
			
			if (i <= 3)
			{
				tileList.add(new Block(x,50,510,25,Color.GREEN)); //last ends at 1640
				x+=520;
				continue;
			}
			
		
			if(i > 3 && i<8)
			{
				tileList.add(new Block(x2,50+ addY,510,25,Color.GREEN));
				x2+=520;
				continue;
			}//last ends at 1640 
			if (i > 7 && i < 12)
			{
				tileList.add(new Block(x3,50 + addY2,510,25,Color.GREEN)); //last ends at 1640
				x3+=520;
				continue;
			}
			if(i > 11 && i < 16)
			{
				tileList.add(new Block(x4,50 + addY3,510,25,Color.GREEN));
				x4+=520;
				continue;
			}	
			
		}
		
		
		
		
		//add more test cases			
	}

	
}