//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.awt.Color;

class PaddleTestOne
{
	public static void main( String args[] )
	{
		Paddle one = new Paddle();
		out.println(one);
		
		Paddle two = new Paddle(300,270);
		out.println(two);
		
		Paddle three = new Paddle(300,300,90);
		out.println(three);
		
		Paddle four = new Paddle(300,300,90,150,24);
		out.println(four);
		
		Paddle five = new Paddle(300,300,90,60, Color.GREEN,18);
		out.println(five);
		
		
		out.println(five.equals(four));		
		
		out.println(five.equals(five));										
	}
}