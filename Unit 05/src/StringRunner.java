//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		StringOddOrEven test = new StringOddOrEven("cat");
		Scanner keyboard = new Scanner(System.in);
		
		for (int x = 0; x < 9; x++) {
			System.out.println("Enter a word :: ");
			test.setString(keyboard.nextLine());
			System.out.println(test);
			
		}
		
		
	}
}