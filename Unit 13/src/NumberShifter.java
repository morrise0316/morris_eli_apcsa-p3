//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	
	public static int[] makeLucky7Array( int size)
	{
		Random r = new Random();
		int[] l7Array = new int[size];
		for (int x = 0; x < size; x++)
			l7Array[x] = r.nextInt(11);
		return l7Array;
	}
	public static void shiftEm(int[] array)
	{
		
		for (int x = 1; x < array.length; x++)
			if(array[x] == 7)
			{
				int z = x-1;
				while (z >= 0 && array[z] != 7)
				{
					array[z+1] = array[z];
					array[z] = 7;
					z--;
				}
			}
	}
}