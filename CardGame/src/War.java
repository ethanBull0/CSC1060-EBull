
public class War {

	public static void main(String[] args) {
		Card card = new Card(5, 2);

		System.out.println("The rank is " + card.getRank());
		System.out.println(card.toString());

		Deck deck = new Deck();
		deck.shuffle();
		System.out.println(deck);
		
		Pile p1 = new Pile();
		Deck sub1 = deck.subdeck(0, 25); //subdeck splits our cards for the game. first 26 cards
		p1.addDeck(sub1);
		
		Pile p2 = new Pile();
		Deck sub2 = deck.subdeck(26, 51); //different part of the same shuffled deck. other 26 cards
		p2.addDeck(sub2); //not 52, last element of cards is 51 and cards[] is length 52.
		
		Pile midPile = new Pile();
		Pile winP1 = new Pile();
		Pile winP2 = new Pile();
		
		
		while(!p1.isEmpty() && !p2.isEmpty()) { //game ends when one pile runs out (de morgans law)
			
			Card c1 = p1.popCard(); //player1's card played. why is it null?
			Card c2 = p2.popCard(); //player2's card played.
			midPile.addCard(c1);
			midPile.addCard(c2);
			int result = c1.compareTo(c2);
			if (result > 0) {
				winP1.addPile(midPile);
			} else if (result < 0) {
				winP2.addPile(midPile);
			} //remove the card from midPile each play.
			
		}
	
		if (winP1.size() > winP2.size()) {
			System.out.println("Player 1 wins");
		} else if (winP2.size() > winP1.size()){
			System.out.println("Player 2 wins");
		} else {
			System.out.println("Tie!");
		}
	}

	
}
