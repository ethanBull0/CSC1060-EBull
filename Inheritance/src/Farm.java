
public class Farm {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Garfield", 50.0, 25.0, "Orange");
		System.out.println(cat1.getColor());
		System.out.println(cat1);
		
		Horse horse1 = new Horse("Roscoe", 750.0, 125.0, "Wild");
		System.out.println(horse1);

		Animal[] animals = new Animal[5];
		animals[0] = cat1;
		animals[1] = horse1;
		
		
		for (Animal anim : animals) {
			if (anim instanceof Horse) {
				Horse horse = (Horse) anim;
				System.out.println(((Horse) anim).makeSound());
			}
		}
	}

}
