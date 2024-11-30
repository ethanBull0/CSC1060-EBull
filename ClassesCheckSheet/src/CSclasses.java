import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class CSclasses {
	
	public static void main(String[] args) {
		String filePath = "courses.csv";
		Scanner scn = new Scanner(System.in);
		ArrayList<Course> courses = new ArrayList<>();
		
		System.out.println("Select an option:\n(1) Read\n(2) Write");
		int option = scn.nextInt();
			if (option == 2) {
				writeCourses(filePath);
			} else if (option == 1) {
				ArrayList<Course> printMe = readCourses(filePath);
				System.out.println(printMe); //ArrayList's toString() method
			}
	}
	
	public static ArrayList<Course> readCourses(String filePath) { //Compiles courses from a .csv file into an ArrayList of Courses.
		String line = "";
		ArrayList<Course> courses = new ArrayList<>();
		BufferedReader read = null;
		try {
			read = new BufferedReader(new FileReader(filePath));
			while ((line = read.readLine()) != null) {
				String[] thisCourse = line.split(",");
				int numStudents = Integer.parseInt(thisCourse[2]);
				int maxStudents = Integer.parseInt(thisCourse[3]);
				int credits = Integer.parseInt(thisCourse[4]);
				if (thisCourse[0].equals("InPersonCourse")) {
					int roomNumber = Integer.parseInt(thisCourse[6]);
					Course inPerson = new InPersonCourse(thisCourse[1], numStudents, maxStudents, credits, thisCourse[5], roomNumber);
					courses.add(inPerson);
				} else if (thisCourse[0].equals("RealTimeRemoteCourse")) {
					Course realTime = new RealTimeRemoteCourse(thisCourse[1], numStudents, maxStudents, credits, thisCourse[5]);
					courses.add(realTime);
				} else if (thisCourse[0].equals("FullRemoteCourse")) {
					Course fullRemote = new FullRemoteCourse(thisCourse[1], numStudents, maxStudents, credits, thisCourse[5]);
					courses.add(fullRemote);
				}
			}
		} catch (Exception x) {
			System.out.println("Could not read data. Check the formatting of your .csv file!");
		} finally {
			try {
				read.close();
			} catch (Exception e) {
				System.out.println("Could not close reader!");
			}
		}
		/*Scanner scn = new Scanner(System.in);
		System.out.println("Select another Action? (Y/N)");
		char selection = '\0';
		while (selection != 'Y' || selection != 'y' || selection != 'X' || selection != 'x') {
			selection = scn.next().charAt(0);
		}
		if (selection == 'Y' || selection == 'y') {
			main(null);
		} */
		return courses;
	}
	
	public static void writeCourses(String filePath) {
		Scanner scan = new Scanner(System.in);
		File courses = new File(filePath);
		if (!courses.exists()) {
			try {
				courses.createNewFile();
			} catch (IOException e) {
				System.out.println("Could not create new file!");
				e.printStackTrace();
			}
		}
		System.out.println("Select an option:\n(1) Delete\n(2) Add");
		if (scan.nextInt() == 1) { //delete
			ArrayList<Course> course = readCourses(filePath); //do this so we can 
			asciiDisplay(course);
			try {
				System.out.println("Select an entry to delete: ");
				int selection = scan.nextInt();	
				course.remove(selection);
				File coursesOverwrite = new File(filePath);
				//insert course.forEach(c -> insertCourse(c));
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Could not find entry in array!");
			}
			
		} else if (scan.nextInt() == 2) { //add
			System.out.println("Enter your course type:\n(1) InPersonCourse\n(2) RealTimeRemoteCourse\n(3) FullRemoteCourse");
			if (scan.nextInt() == 1) {
				
			} else if (scan.nextInt() == 2) {
				
			} else if (scan.nextInt() == 3) {
				
			}
		}
		
		
	}
	
	public static void traverse(Course[] courseList) {
		for (Course c : courseList) {
			if (c instanceof FullRemoteCourse) {
				System.out.println("Course #: " + c.getCourseNumber());
				System.out.println("Credits: " +  c.getCredits());
				System.out.println("Max Students: " + c.getMaxStudents());
				System.out.println("Number of Students: " + c.getNumStudents());
			}
			if (c instanceof RealTimeRemoteCourse) {
				System.out.println(((RealTimeRemoteCourse) c).getZoomInfo());
				System.out.println("Course #: " + c.getCourseNumber());
				System.out.println("Credits: " +  c.getCredits());
				System.out.println("Max Students: " + c.getMaxStudents());
				System.out.println("Number of Students: " + c.getNumStudents());
			}
			if (c instanceof InPersonCourse) {
				System.out.println(((InPersonCourse) c).getRoomNumber());
				System.out.println("Course #: " + c.getCourseNumber());
				System.out.println("Credits: " +  c.getCredits());
				System.out.println("Max Students: " + c.getMaxStudents());
				System.out.println("Number of Students: " + c.getNumStudents());
			}
		}
	}
	
	public static void asciiDisplay(ArrayList<Course> courses) { //Displays .csv in an easily readable, ASCII format.
		for (int i = 0; i < courses.size(); i++) {
			Course c = courses.get(i);
			System.out.print(i + ". ");
			if (c instanceof FullRemoteCourse) {
				System.out.print("FullRemoteCourse " + c.getCourseNumber() + " " + c.getCredits() + " " + c.getNumStudents() + " " + c.getMaxStudents() + " " + ((FullRemoteCourse) c).getContactEmail());
			} else if (c instanceof RealTimeRemoteCourse) {
				System.out.print("RealTimeRemoteCourse " + c.getCourseNumber() + " " + c.getCredits() + " " + c.getNumStudents() + " " + c.getMaxStudents() + " " + ((RealTimeRemoteCourse) c).getZoomInfo());
			} else if (c instanceof InPersonCourse) {
				System.out.print("InPersonCourse " + c.getCourseNumber() + " " + c.getCredits() + " " + c.getNumStudents() + " " + c.getMaxStudents() + " " + ((InPersonCourse) c).getBuilding() + " " + ((InPersonCourse) c).getRoomNumber());
			}
			System.out.println("\n");
		}
	}
}
