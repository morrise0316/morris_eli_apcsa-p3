//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private double distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(double dist, double hrs, double mins)
	{
		setNums(dist,hrs,mins);
	}

	public void setNums(double dist, double hrs, double mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		mph = distance/(hours+(minutes/60));
	}

	public void print()
	{
		//100 miles in 2 hour and 25 minutes = 41 MPH.
		System.out.println(distance + " miles in " + hours + " hour(s) and " + minutes + " minutes = " + mph + " MPH.");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
	
	
}
	