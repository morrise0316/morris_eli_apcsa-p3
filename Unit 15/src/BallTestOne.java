//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.awt.Color;

class BallTestOne
{
	public static void main( String args[] )
	{
		Ball one = new Ball();
		out.println(one);
		
		Ball two = new Ball(300,270);
		out.println(two);
		
		Ball three = new Ball(300,300,90,150);
		out.println(three);
		
		Ball four = new Ball(300,300,90,150,Color.BLUE);
		out.println(four);
		
		Ball five = new Ball(300,300,90,150,Color.BLUE,15,18);
		out.println(five);
		
									//x, y, wid, ht, color, xSpd, ySpd
		Ball six = new Ball(300,300,90,150,Color.blue,15,18);
		out.println(six);		
		
		out.println(five.equals(four));		
		
		out.println(five.equals(five));										
	}
}