//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   Scanner keyboard = new Scanner(System.in);
	   WordsCompare test = new WordsCompare();
		for (int x = 0; x < 9; x++) {
			System.out.println("Input word 1 :: ");
			String wd1 = keyboard.nextLine();
			System.out.println("Input word 2 :: ");
			String wd2 = keyboard.nextLine();
			
			test.setWords(wd1, wd2);
			test.compare();
			System.out.println(test);

		}

	}
}