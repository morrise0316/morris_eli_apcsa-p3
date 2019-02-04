//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
	    int testCaseCount = 0;
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		test.print();
		
		System.out.println("\n \nHow many more test cases would you like to conduct?");
		testCaseCount = keyboard.nextInt();
		if (testCaseCount >= 1) {
			for (; testCaseCount > 0; testCaseCount-- ) {
				out.print("Enter the distance :: ");
				dist = keyboard.nextInt();

				out.print("Enter the hours :: ");
				hrs = keyboard.nextInt();

				out.print("Enter the minutes :: ");
				mins = keyboard.nextInt();

				test.setNums(dist, hrs, mins);
				test.calcMPH();
				test.print();
			}
		}
		System.out.println("\n \nWould you like to see the default cases? /n"
				+ "Press 1 if you would like to see the default cases.");
		int defCount = keyboard.nextInt();
		if (defCount == 1) {
			test.setNums(45, 0, 32);
			test.calcMPH();
			test.print();
			
			test.setNums(96, 1, 43);
			test.calcMPH();
			test.print();
			
			test.setNums(100, 2, 25);
			test.calcMPH();
			test.print();
			
			test.setNums(50, 2, 25);
			test.calcMPH();
			test.print();
			
		}
		
		
	}
}