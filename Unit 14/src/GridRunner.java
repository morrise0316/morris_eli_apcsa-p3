//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] testVals = {"a","b","c","7","9","x","2"};
		Grid g1 = new Grid(10,10,testVals);
		System.out.println(g1 + "\n" + g1.findMax(testVals) + " occurs the most.");
	}
}