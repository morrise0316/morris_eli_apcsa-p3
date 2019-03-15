//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		Scanner toyScanner = new Scanner(toys);
		while (toyScanner.hasNext())
		{
			boolean skipIteration = false;
			Toy checkToy = new Toy(toyScanner.next());
			for(Toy x: toyList)
			{
				if (x.getName().equals(checkToy.getName()))
				{
					x.setCount(x.getCount()+1);
					skipIteration = true;
				}
			}
			if (skipIteration)
				continue;
			else 
				toyList.add(checkToy);
		}
	}
	public ArrayList<Toy> getList()
	{
		return toyList;
	}
  	public Toy getThatToy( String nm )
  	{
  		for (Toy z : toyList)
  			if (nm.equals(z.getName()))
  				return z;
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		//Alternative way without using the sortToysByCount method
  		/*Toy mostFrequentToy = toyList.get(0);
  		for (Toy y : toyList)
  			if(y.getCount() > mostFrequentToy.getCount())
  				mostFrequentToy = y;
  		for (Toy n : toyList)
  			if(n.getCount()==mostFrequentToy.getCount() && toyList.indexOf(n) != toyList.indexOf(mostFrequentToy))
  				return "There is either more than one \"most frequent\" toy or all toys have the same frequency of "
  						+ mostFrequentToy.getCount();
  		return mostFrequentToy.getName(); */
  		sortToysByCount();
  		Toy mostFrequentToy = toyList.get(0);
  		for (int x = 1;x<toyList.size();x++)
  			if(toyList.get(x).getCount() == mostFrequentToy.getCount())
  				return "There is either more than one \"most frequent\" toy or all toys have the same frequency of "
					+ mostFrequentToy.getCount();
  		return mostFrequentToy.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		ArrayList<Toy> sortedToys = new ArrayList<Toy>();
  		int i = 0;
  		while (sortedToys.size() < toyList.size())
  		{
  			for (Toy t : toyList)
  				if (t.getCount() == i)
  					sortedToys.add(t);
  			i++;
  		}
  		for (Toy f : sortedToys)
  			toyList.set(toyList.size() - sortedToys.indexOf(f) - 1, f);
  	}  
  	  
	public String toString()
	{
	   sortToysByCount();
	   return toyList + "\n" + "max == " + getMostFrequentToy();
	}
}