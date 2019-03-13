import java.util.List;
import java.util.Random;

public class DeckWithList {
	private List<Card> cards;
	private int size;
	
	public DeckWithList(String[] ranks, String[] suits, int[] values) {
		size = suits.length*ranks.length;
		
		for (int sIndex = 0; sIndex < suits.length; sIndex++)
			for (int rvIndex = 0; rvIndex < ranks.length; rvIndex ++)
			{
				
				cards.add(new Card(ranks[rvIndex],suits[sIndex],values[rvIndex]));
			}
		shuffle();
	}
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (size == 0) return true;
		return false;
	}
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size;
	}
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		size = cards.size();
		Random rand = new Random();
		for (int x = size-1;x>0;x--)
		{
			int exchange = rand.nextInt(x+1);
			Card original = cards.get(exchange);
	
			cards.set(exchange, cards.get(x));
			
			cards.set(x, original);
		}
	}
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	if (size <= 0)
		return null;
	size--;
	return cards.get(size);
	}
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
