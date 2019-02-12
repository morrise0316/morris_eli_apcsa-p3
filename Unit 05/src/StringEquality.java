//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;
	

	public StringEquality()
	{
		this.setWords("", "");
	}

	public StringEquality(String one, String two)
	{
		this.setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		if (wordOne.equals(wordTwo)) {
			return true;
		}
		return false;
	}

	public String toString()
	{
		if (this.checkEquality() == true) {
			return wordOne + " has the same letters as " + wordTwo + "\n";
		}
		return wordOne + " does not have the same letters as " + wordTwo + "\n";
	}
}