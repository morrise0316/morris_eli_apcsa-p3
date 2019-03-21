//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Enter 1st monster's name : ");
		String name = keyboard.next();
		System.out.println("Enter 1st monster's size : ");
		int size = keyboard.nextInt();
		//instantiate monster one
		Monster m1 = new Skeleton(name,size);
		//ask for name and size
		System.out.println("Enter 2nd monster's name : ");
	    name = keyboard.next();
		System.out.println("Enter 2nd monster's size : ");
		size = keyboard.nextInt();
		//instantiate monster two
		Monster m2 = new Skeleton(name,size);
		System.out.println("Monster 1 - " + m1);
		System.out.println("Monster 2 - " + m2);
		if(m1.isBigger(m2))
			System.out.println("Monster 1 is bigger than Monster 2.");
		else if(m1.isSmaller(m2))
			System.out.println("Monster 1 is smaller than Monster 2.");
		if(m1.namesTheSame(m2))
			System.out.println("Monster 1 has the same name as Monster 2.");
		else
			System.out.println("Monster 1 does not have the same name as Monster 2.");

	}
}