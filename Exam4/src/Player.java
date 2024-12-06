
public class Player {

	private String name;
	private Die die;
	
	public Player() {
		
	}

	public Player(String name, Die die) {
		super();
		this.name = name;
		this.die = die;
	}

	public void playerRoll() {
		die.roll();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Die getDie() {
		return die;
	}

	public void setDie(Die die) {
		this.die = die;
	}

}
