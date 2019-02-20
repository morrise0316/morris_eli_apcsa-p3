//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

	public class Perfect
	{
		private int number;

	public Perfect() 
	{
		setNumber(0);
	}

	public Perfect(int num) 
	{
		setNumber(num);
	}
	
	public void setNumber (int num) 
	{
		number = num;
	}

	public boolean isPerfect()
	{
		int divisorSum = 0;
		for (int x = 1; x < number; x++) 
		{
			if (number % x == 0) 
			{
				divisorSum += x;
			}
		}
		
		if (number == divisorSum) 
		{
			return true;
		}
		
		return false;
	}

	public String toString () {
		if (isPerfect() == true) {
			return number + " is perfect. \n";
		}
		return number + " is not perfect. \n";
	}
	
}