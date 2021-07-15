/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args)
	{
		Card card1 = new Card("A", "Spades", 1);
		Card card2 = new Card("A", "Spades", 1);
		Card card3 = new Card("K", "Clubs", 13);
		
		System.out.println(card1.toString());
		System.out.println(card1.getSuit());
		System.out.println(card1.getRank());
		System.out.println(card1.getPointValue());
		
		System.out.println(card2.toString());
		System.out.println(card2.getSuit());
		System.out.println(card2.getRank());
		System.out.println(card2.getPointValue());
		
		System.out.println(card3.toString());
		System.out.println(card3.getSuit());
		System.out.println(card3.getRank());
		System.out.println(card3.getPointValue());
		
		System.out.println(card1.matches(card2));
		System.out.println(card1.matches(card3));
	}
}
