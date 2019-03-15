//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy test = new Toy("RC car");
		System.out.println(test);
		
		test.setCount(5);
		System.out.print(test);
	}
}