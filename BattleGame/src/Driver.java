import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		 Random rand = new Random();
		
		Character hero = new Character("Person", 50, 45, 30);
		Character monster = new Character("Monster", 100.0, 30, 10);
		Weapon weapon = new Weapon("Claws", 2, 0.4);
		Weapon sword = new Weapon("Sword", 6, 1.5);
		monster.setWeapon(weapon);
		hero.setWeapon(sword);
		
		while (!monster.isDead() || !hero.isDead()) {
			double turn = rand.nextDouble();
			if (turn < 0.5) {
				monster.recordDamage(hero.doDamage());
			} else {
				hero.recordDamage(monster.doDamage());
			}
			
		}
	}



}
