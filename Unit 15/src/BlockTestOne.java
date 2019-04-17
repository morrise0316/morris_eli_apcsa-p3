//(c) A+ Computer Science
//www.apluscompsci.com
//Name -- 

import static java.lang.System.*;
import java.awt.Color;
import java.awt.Graphics;

class BlockTestOne
{
	public static void main( String args[] )
	{
		Block one = new Block();
		out.println(one);

		Block two = new Block(150,150,90,90);
		out.println(two);

		Block three = new Block(1050,1050,45,45,Color.RED);
		out.println(three);

		Block four = new Block(1350,150,60,180, Color.GREEN);
		out.println(four);
		
		out.println(one.equals(two));
		out.println(one.equals(one));	
		
		
	
	}
}