//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
		sort();
	}

	public void sort()
	{
		for (int x = 1; x < wordRay.length; x++)
		{
			String n = new String(wordRay[x]);
			int i = x;
			while ( i-1 >= 0 && n.compareTo(wordRay[i-1]) < 0)
			{
				wordRay[i] = wordRay[i-1];
				wordRay[i-1] = n;
				i--;
			}
		}
	}

	public String toString()
	{
		String output="";
		output += Arrays.toString(wordRay);
		return output+"\n\n";
	}
}