//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore toysRus = new ToyStore();
		toysRus.loadToys("truck car car plane plane plane truck car car boat train train boat");
		System.out.println(toysRus);
		
	}
}