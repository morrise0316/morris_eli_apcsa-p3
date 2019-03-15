//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num1 = 1;
	private int den1 = 1;
	//write two constructors
	public Rational()
	{
		setRational(1,1);
	}
	public Rational(int num, int den)
	{
		setRational(num,den);
	}

	//write a setRational method
	public void setRational(int num, int den)
	{
		num1 = num;
		den1 = den;
	}

	//write  a set method for numerator and denominator
	public void setNum (int num)
	{
		num1=num;
	}
	public void setDen (int den)
	{
		den1=den;
	}
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		num1 = (this.num1 * other.den1 + other.num1 * this.den1);
		den1 = (this.den1 * other.den1);
		


		reduce();
	}

	private void reduce()
	{
		int gcdenom = gcd(num1,den1);
		num1 /= gcdenom;
		den1 /= gcdenom;
			
		


	}

	private int gcd(int numOne, int numTwo)
	{
		if(numOne<=numTwo)
			for (int x = numOne; x > 0; x--)
			{
				if(numOne % x == 0 && numTwo % x == 0)
				{
					return x;
				}
			}
		else if(numOne>numTwo)
		{
			for (int y = numTwo; y > 0; y--)
				if(numOne % y == 0 && numTwo % y == 0)
				{
					return y;
				}
			
		}


		return 1;
	}

	public Object clone ()
	{
		return new Rational(num1,den1);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNum()
	{
		return num1;
	}
	public int getDen()
	{
		return den1;
	}
	public boolean equals(Object obj)
	{
		
		if (!obj.getClass().equals(this.getClass()))
		return false;
		Rational c =  (Rational) obj;
		return (this.compareTo(c) == 0);
	}

	public int compareTo(Rational other)
	{
		if((double)num1/den1 > (double) other.num1/other.den1)
			return 1;
		else if ((double)num1/den1 < (double) other.num1/other.den1)
			return -1;

		return 0;
	}



	
	//write  toString() method
	public String toString()
	{
		return num1 + "/" + den1;
	}
	
}