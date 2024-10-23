/*Card defines the properties of cards.
  Use RANK[0 to 13] to define rank.
  Use SUITS[0 to 3] to define suits.
  0 = Clubs, 1 = Diamonds,
  2 = Hearts, 3 = Spades
  */
public class Card { 
	//data members, attributes, data fields
	private int rank;
	private int suit;
	
	public final String[] RANKS = {
			null, "Ace", "2", "3", "4", "5", "6", "7",
			"8", "9", "10", "Jack", "Queen", "King"
	};
	public final String[] SUITS = { //0 = Clubs, 1 = Diamonds, 2 = Hearts, 3 = Spades
		"Clubs", "Diamonds", "Hearts", "Spades"
	};
	public Card(int rank, int suit) { //method that starts with an uppercase letter because it is from the class's constructor.
		this.rank = rank; //keyword this opens up access to the private int rank to assign the input to it.
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
	
	@Override
	public String toString() {
		return RANKS[rank] + " of " + SUITS[suit];
	}
}
