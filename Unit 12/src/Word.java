//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{
		int compareLen = word.length()-rhs.toString().length();
		if(compareLen != 0)
			return compareLen;
		else
			return word.compareTo(rhs.toString());
	}

	public String toString()
	{
		return word;
	}
}