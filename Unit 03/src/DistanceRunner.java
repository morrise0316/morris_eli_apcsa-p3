//(c) A+ Computer Science
//www.apluscompsci.com

//Name - ELi Morris
//Date - 2/4/2019
//Class - Per 3
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Distance test1 = new Distance(1.0,1.0,2.0,1.0);
		test1.calcDistance();
		test1.print();
		
		test1.setCoordinates(1.0, 1.0, -2.0, 2.0);
		test1.calcDistance();
		test1.print();
		
		test1.setCoordinates(1.0, 1.0, 0.0, 0.0);
		test1.calcDistance();
		test1.print();
			
	}
}