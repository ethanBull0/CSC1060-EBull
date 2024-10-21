//Deck holds the array of cards themselves.
import java.util.Random;
import java.util.Arrays;
public class Deck {
	private Card[] cards;
	
	public Deck() {
		this.cards = new Card[52];
		int cardIndex = 0;
		for (int j = 0; j < 4; j++) { //j = suit. one suit corresponding to each rank.
			for (int i = 1; i < 14; i++) { //everything from Ace to Queen.
				cards[cardIndex] = new Card(i, j); //rank, suit
				cardIndex++;
			}
		}
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	
	public void shuffle() {
		Random rand = new Random();
		
		for (int i = 0; i < cards.length; i++) { //cards.length is kinda a dummy value
		int val1 = rand.nextInt(52);
		int val2 = rand.nextInt(52);
		Card tmp = cards[val1]; //the value of the array is a Card, which holds a rank and suit, not an int.
		cards[val1] = cards[val2];
		cards[val2] = tmp; //I can also shuffle with the index to replace each one instead of just using it as a counter.
		}
	}
	
	public String toString() {
		return "Deck [cards=" + Arrays.toString(cards) + "]";
		/*
		 String str = "";
		 for (int i = 0; i < cards.length; i++) {
		 if (i != 0) {
		 	str = str + ", " + "cards[i].toString();
		 }
		 else {
		  	str = str + cards[i].toString();
		  }
		  return str;
		 */
		/* Or we can use StringBuilder
		 StringBuilder str = new StringBuilder();
		 for (int i = 0; i < cards.length; i++) {
		 if (i != 0) {
		 	str.append(", ");
		 	str.append(cards[i]);
		 }
		 else {
		 	str.append(cards[i]);
		 }
		}
		 return str.toString;
		 */
		
	}
	
}
