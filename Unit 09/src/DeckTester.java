/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck test1 = new Deck(new String[] {"A","B","C"},new String[] {"Giraffes","Lions"}, new int[] {2,1,6});
		System.out.println(test1);
		int size2 = test1.size();
		for(int z = 0; z < size2; z++)
		System.out.println(test1.deal());
	}
}
