import java.util.ArrayList;

public class TestSchoolRecords {


	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<Person>();
		
		personList.add(new Student("Ethan", "5678 Some Rd", "(303)-670-1818", "ethanbull@gmail.com", 1));
		personList.add(new Student("Brooklyn", "0012 That Other Rd", "(970)-210-2643", "brooklynsemail@email.com", 1));
		personList.add(new Faculty("Mr.teacher", "4000 Mansion Dr", "(970)-999-9876", "mrteacher@yahoo.com", "BP", 55000, "11/22/1995", "3PM Wednesdays, 3PM Saturdays", true));
		personList.add(new Faculty("Cooler teacher", "9001 Bigger Mansion Dr", "(970)-222-3333", "imthebest@gmail.com", "BP", 999999, "2/29/1901", "5AM Monday-Sunday", true));
		personList.add(new Staff("The boss", "0000 Confidential Rd", "(111)-111-1111", "email@email.com", "AP" , 00000, "10/21/2005", "CEO"));
		personList.add(new Staff("Justin", "1994 Cool Rd", "(323)-484-1684", "imherejustincase@outlook.com", "AP" , 25000, "1/18/2002", "Accountant"));
		for (Person p : personList) {
			printInfo(p);
		}
	
	
	}
	
	public static void printInfo(Person person) {
		if (person instanceof Student) {
			System.out.println(person.getClass());
		}
		if (person instanceof Staff) {
			System.out.println(person.getClass());
		}
		if (person instanceof Faculty) {
			System.out.println(person.getClass());
		}
		System.out.println(person.getName());
		System.out.println(person.getAddress());
		System.out.println(person.getPhoneNum());
		System.out.println(person.getEmail());
		
	}
}

