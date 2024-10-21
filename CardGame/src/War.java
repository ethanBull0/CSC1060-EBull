
public class War {

	public static void main(String[] args) {
		Card card = new Card(5, 2);

		System.out.println(card);

		Deck deck = new Deck();
		deck.shuffle();
		System.out.println(deck);
	}

}
