import java.util.ArrayList;
import java.util.List;

public class Pile {
	private List<Card> cards;
	
	public Pile() {
		this.cards = new ArrayList<Card>(); //strongly typed
		//this.cards = new ArrayList<>(); // new way to do it
	}
	
	public void addDeck(Deck deck) {
		//for (int i = 0; i < dCards.length; i++) {
		//	this.cards.add(dCards[i]);
		//}
		Card[] dCards = deck.getCards();
		for (Card c : dCards) { //for-each loop -> unlike an integer-based loop, we do not need to use an array. 
			this.cards.add(c); //.add for Lists.
		}
	}
	
	public Card popCard() {
		Card card = cards.remove(0);
		return card; //returns null after 1st loop
	}
	
	public int size() {
		return cards.size(); //enable access to this function of card.
	}
	public void addCard(Card card) { //void because we input and do not expect output (at this method)
		cards.add(card);
	} // creates null?
	
	public boolean isEmpty() {
		return cards.isEmpty(); //isEmpty on this line is a List function.
	} //we must do it this way because ArrayList cards is private.
	
	public void addPile(Pile oPile) { //remove and add cards
		for (int i = 0; i < oPile.cards.size(); i++) {
			this.cards.add(oPile.cards.remove(i));
		}
		
		//for (Card c : oPile.cards) {
		//	cards.add(c); //removes card from oPile and adds it to this pile.
		//}
	}
}
