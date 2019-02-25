//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		this(' ',0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int indexOfLetter = alphabet.indexOf(letter);
		for (int a = 0; a < amount; a++)
		{
			for (int b = indexOfLetter; b < indexOfLetter + amount - a; b++)
			{
				if (b > 25) 
				{
					for (int d = 0; d < amount + indexOfLetter - b - a; d++) 
					{
						for (int e = indexOfLetter + amount - alphabet.length() - d; e > 0; e--)
						output += alphabet.charAt(d);
						output += " ";
					} 
					break; 
				} 
				for (int c = amount + indexOfLetter - b; c > 0; c--)
				{
					output += alphabet.charAt(b);
				}
					output += " ";
			}
			output += "\n";
		}
		
		
		return output;
	}
}