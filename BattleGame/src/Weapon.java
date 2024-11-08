
public class Weapon {

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getDamageFactor() {
		return damageFactor;
	}

	public void setDamageFactor(int damageFactor) {
		this.damageFactor = damageFactor;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public Weapon(String name, int damageFactor, double range) {
		super();
		Name = name;
		this.damageFactor = damageFactor;
		this.range = range;
	}

	private String Name;
	private int damageFactor;
	private double range;
	
	public Weapon() {
		
	}

}
