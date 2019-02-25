//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int [] numTestArray = {a,b,c};
		int max = 0;
		for (int testNum : numTestArray)
		{
			for (int start = 1; start < testNum; start++) 
			{
				if ((a % start == 0) && (b % start == 0) && (c % start == 0) && (start > max)) 
				{
					max = start;
				}
			}
		}
		return max;
	}

	public String toString()
	{
		String output="";
		for (int a = 1; a < number; a++)
			for (int b = a; b < number; b++)
				for (int c = b; c < number; c++) 
				{
					if (Math.pow(a,2) + Math.pow(b, 2) == Math.pow(c, 2))
					{
						if (((a%2 == 0 && b%2 != 0) || (a%2!=0 && b%2 == 0)) && c%2 != 0)
						{
							if (greatestCommonFactor(a,b,c) <= 1)
							{
								output += a + " " + b + " " + c + "\n";
							}
						}
					}
				}
					
		return output +"\n";
	}
}