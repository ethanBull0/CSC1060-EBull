/*Card defines the properties of cards.
  Use RANK[0 to 13] to define rank.
  Use SUITS[0 to 3] to define suits.
  0 = Clubs, 1 = Diamonds,
  2 = Hearts, 3 = Spades
  */
public class Card { 
	private int rank;
	private int suit;
	
	public final String[] RANKS = {
			null, "Ace", "2", "3", "4", "5", "6", "7",
			"8", "9", "10", "Jack", "Queen", "King"
	};
	public final String[] SUITS = { //0 = Clubs, 1 = Diamonds, 2 = Hearts, 3 = Spades
		"Clubs", "Diamonds", "Hearts", "Spades"
	};
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}
	
	public String toString() {
		return RANKS[rank] + " of " + SUITS[suit];
	}
}
