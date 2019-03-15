//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		if (spot < pups.length && spot >= 0)
		pups[spot] = new Dog(age,name);
	}

	public String getNameOfOldest()
	{
		String name = pups[0].getName();
		int age = pups[0].getAge();
		for (int i = 1; i < pups.length; i++)
			if (pups[i].getAge() > age)
			{
				name = pups[i].getName();
				age = pups[i].getAge();
			}
		
		return name;
	}

	public String getNameOfYoungest()
	{
		String name = pups[0].getName();
		int age = pups[0].getAge();
		for (int i = 1; i < pups.length; i++)
			if (pups[i].getAge() < age)
			{
				name = pups[i].getName();
				age = pups[i].getAge();
			}
		
		return name;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}