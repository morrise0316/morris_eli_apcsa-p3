//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover();
		String[] sentence = {"I am Sam I am","ssssssssxssssesssssesss","qwertyqwertyqwerty","abababababa","abaababababa"};
		char[] lookFor = {'a','s','a','b','x'};
		for (int x = 0; x < 5; x++) 
		{
			test.setRemover(sentence[x], lookFor[x]);
			System.out.println(test);
		}
	}
}