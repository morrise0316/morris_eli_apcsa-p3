//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		char[] wordArr = word.toCharArray();
		for(int x = 0; x < word.length(); x++)
		{
			for (int y = 0; y < x + 1; y++)
				for (int z = 0; z < x + 1; z++)
				{
					System.out.print(wordArr[z]);
				}
			System.out.println("");
		}
	}
}