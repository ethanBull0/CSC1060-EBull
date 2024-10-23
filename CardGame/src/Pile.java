import java.util.ArrayList;
import java.util.List;

public class Pile {
	private List<Card> cards;
	
	public Pile() {
		this.cards = new ArrayList<Card>(); //strongly typed
		//this.cards = new ArrayList<>(); // new way to do it
	}
}
