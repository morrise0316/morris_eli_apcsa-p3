//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		for (int x = 0; x <6; x++) 
		{
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		System.out.println("Bill after discount :: " + Discount.getDiscountedBill(amt));
		}
	}
}