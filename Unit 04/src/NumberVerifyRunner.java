//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Number being evaulated is 5.");
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		System.out.println("Enter a whole number :: "); 
		
		for (int x = 0; x <5; x++) 
		{
		int test = keyboard.nextInt();
		System.out.println(test + " is odd :: " + NumberVerify.isOdd(test));
		System.out.println(test + " is even :: " + NumberVerify.isEven(test));
		}
		
	}
}