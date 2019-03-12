/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card = new Card("Queen", "Hearts", 15);
		System.out.println(card);
		card = new Card("King", "Diamonds", 15);
		System.out.println(card);
		card = new Card("Jack", "Clubs", 15);
		System.out.println(card);
	}
}
