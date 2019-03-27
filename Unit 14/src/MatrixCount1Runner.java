import java.util.Arrays;
import java.util.Scanner;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MatrixCount1Runner
{
	public static void main( String args[] ) throws Exception
	{
		MatrixCount1 mtrx = new MatrixCount1();
		System.out.println(mtrx);
		Scanner keyboard = new Scanner(System.in);
		do {
		System.out.println("Please input the number you are looking for in the matrix.");
		int inpt = keyboard.nextInt();
		System.out.println("The " + inpt + " count is :: " + MatrixCount1.count(inpt));
		System.out.println("Would you like to search for more numbers?");
		} while (keyboard.next().equals("Y") || keyboard.next().equals("y"));
	}
}



