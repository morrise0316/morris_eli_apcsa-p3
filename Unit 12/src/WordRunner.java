//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));
		List<Word> wdList = new ArrayList<Word>();
		int size = file.nextInt();
		file.nextLine();
		for (int x = 0; x < size; x++)
		{
			Word wd = new Word(file.next());
			wdList.add(wd);
			Collections.sort(wdList);
		}
		System.out.println(wdList);










	}
}