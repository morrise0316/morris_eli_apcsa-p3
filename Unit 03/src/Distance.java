//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - ELi Morris
//Date - 2/4/2019
//Class - Per 3
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private double xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		setCoordinates(0,0,0,0);
	}

	public Distance(double x1, double y1, double x2, double y2)
	{
		setCoordinates(x1,y1,x2,y2);
	}

	public void setCoordinates(double x1, double y1, double x2, double y2)
	{
		xOne = x1; yOne = y1; xTwo = x2; yTwo = y2;
	}

	public void calcDistance()
	{
		
		distance = (double)Math.sqrt(Math.pow(yTwo-yOne, 2) + Math.pow(xTwo-xOne, 2));
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
		System.out.println(this.getDistance() +"\n");
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}